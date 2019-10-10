--
-- PostgreSQL database dump
--

-- Dumped from database version 10.5
-- Dumped by pg_dump version 10.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: aprovizionare; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.aprovizionare (
    aprovizionare_id integer NOT NULL,
    furnizor_id integer,
    cantitate integer,
    cost numeric,
    produs_id integer
);


ALTER TABLE public.aprovizionare OWNER TO postgres;

--
-- Name: client; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.client (
    client_id integer NOT NULL,
    nume character varying(40),
    telefon character varying(10),
    adresa character varying(50),
    cod_postal character varying(6)
);


ALTER TABLE public.client OWNER TO postgres;

--
-- Name: comanda; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comanda (
    comanda_id integer NOT NULL,
    client_id integer,
    produs_id integer,
    curier_id integer,
    metoda_plata character varying(10),
    cost numeric,
    data date
);


ALTER TABLE public.comanda OWNER TO postgres;

--
-- Name: curier; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.curier (
    curier_id integer NOT NULL,
    nume character varying(25),
    adresa character varying(50),
    cod_postal character varying(6)
);


ALTER TABLE public.curier OWNER TO postgres;

--
-- Name: curerii_comenzilor; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.curerii_comenzilor AS
 SELECT client.nume AS "nume client",
    comanda.comanda_id,
    curier.nume AS "nume curier"
   FROM ((public.comanda
     LEFT JOIN public.client ON ((comanda.client_id = client.client_id)))
     RIGHT JOIN public.curier ON ((comanda.curier_id = curier.curier_id)))
  WHERE ((comanda.curier_id IS NOT NULL) AND (comanda.client_id IS NOT NULL));


ALTER TABLE public.curerii_comenzilor OWNER TO postgres;

--
-- Name: depozit; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.depozit (
    depozit_id integer NOT NULL,
    adresa character varying(50),
    cod_postal character varying(6)
);


ALTER TABLE public.depozit OWNER TO postgres;

--
-- Name: furnizor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.furnizor (
    furnizor_id integer NOT NULL,
    nume character varying(25),
    adresa character varying(50),
    telefon character varying(10)
);


ALTER TABLE public.furnizor OWNER TO postgres;

--
-- Name: produs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.produs (
    produs_id integer NOT NULL,
    nume character varying(25),
    depozit_id integer,
    stoc_produs integer,
    pret_produs numeric,
    marime integer,
    brand character varying(25),
    aprovizionare_id integer
);


ALTER TABLE public.produs OWNER TO postgres;

--
-- Name: detalii_aprovizionare; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.detalii_aprovizionare AS
 SELECT aprovizionare.aprovizionare_id,
    produs.nume AS "nume produs",
    furnizor.nume AS "nume furnizor"
   FROM ((public.aprovizionare
     LEFT JOIN public.produs ON ((aprovizionare.produs_id = produs.produs_id)))
     RIGHT JOIN public.furnizor ON ((aprovizionare.furnizor_id = furnizor.furnizor_id)))
  WHERE ((aprovizionare.furnizor_id IS NOT NULL) AND (aprovizionare.produs_id IS NOT NULL));


ALTER TABLE public.detalii_aprovizionare OWNER TO postgres;

--
-- Name: from_last_year; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.from_last_year AS
 SELECT comanda.comanda_id,
    comanda.client_id,
    comanda.produs_id,
    comanda.curier_id,
    comanda.metoda_plata,
    comanda.cost,
    comanda.data
   FROM public.comanda
  WHERE (comanda.data > (now() - '1 year'::interval));


ALTER TABLE public.from_last_year OWNER TO postgres;

--
-- Name: incasari_per_brand; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.incasari_per_brand AS
 SELECT produs.brand,
    sum(comanda.cost) AS "Cost total"
   FROM (public.comanda
     JOIN public.produs ON ((comanda.produs_id = produs.produs_id)))
  GROUP BY produs.brand;


ALTER TABLE public.incasari_per_brand OWNER TO postgres;

--
-- Name: livrari_per_curier; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.livrari_per_curier AS
 SELECT curier.nume,
    count(comanda.curier_id) AS "Numari livrari"
   FROM (public.comanda
     JOIN public.curier ON ((curier.curier_id = comanda.curier_id)))
  GROUP BY curier.nume;


ALTER TABLE public.livrari_per_curier OWNER TO postgres;

--
-- Name: medie_produse_depozit; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.medie_produse_depozit AS
 SELECT depozit.depozit_id,
    avg(produs.pret_produs) AS "Medie pret"
   FROM (public.produs
     JOIN public.depozit ON ((depozit.depozit_id = produs.depozit_id)))
  GROUP BY depozit.depozit_id;


ALTER TABLE public.medie_produse_depozit OWNER TO postgres;

--
-- Name: metoda_plata_card; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.metoda_plata_card AS
 SELECT comanda.comanda_id,
    comanda.client_id,
    comanda.produs_id,
    comanda.curier_id,
    comanda.metoda_plata,
    comanda.cost,
    comanda.data
   FROM public.comanda
  WHERE ((comanda.metoda_plata)::text = 'card'::text);


ALTER TABLE public.metoda_plata_card OWNER TO postgres;

--
-- Name: produse_stoc_epuizat; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.produse_stoc_epuizat AS
 SELECT produs.produs_id,
    produs.nume,
    produs.depozit_id,
    produs.stoc_produs,
    produs.pret_produs,
    produs.marime,
    produs.brand,
    produs.aprovizionare_id
   FROM public.produs
  WHERE (produs.stoc_produs = 0);


ALTER TABLE public.produse_stoc_epuizat OWNER TO postgres;

--
-- Name: produsele_clientilor; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public.produsele_clientilor AS
 SELECT client.nume AS "nume client",
    comanda.comanda_id,
    produs.nume AS "nume produs"
   FROM ((public.comanda
     LEFT JOIN public.client ON ((comanda.client_id = client.client_id)))
     RIGHT JOIN public.produs ON ((comanda.produs_id = produs.produs_id)))
  WHERE ((comanda.produs_id IS NOT NULL) AND (comanda.client_id IS NOT NULL))
  ORDER BY comanda.client_id;


ALTER TABLE public.produsele_clientilor OWNER TO postgres;

--
-- Data for Name: aprovizionare; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.aprovizionare (aprovizionare_id, furnizor_id, cantitate, cost, produs_id) FROM stdin;
501	11	5	2500	10001
500	10	50	50341	10000
502	12	39	42112	10002
503	12	10	1999	10003
504	12	100	10250	10004
\.


--
-- Data for Name: client; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.client (client_id, nume, telefon, adresa, cod_postal) FROM stdin;
1000	Gica Petrescu	0700002188	Str. Portitei, nr. 22, Brasov	222500
1001	Zid Zizin	0707070755	Str. Zidului, nr. 4, Sacele	745874
1002	Robert Rotaru	0748324823	Str. Rotii, nr. 3, Timisoara	799645
1003	Urzica Mihai	0722450947	Str. Centru, nr. 650, Zarnesti	556426
1004	Stefan Alex	0733439352	Str. Sperantei, nr. 1, Valcea	126123
\.


--
-- Data for Name: comanda; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.comanda (comanda_id, client_id, produs_id, curier_id, metoda_plata, cost, data) FROM stdin;
100000	1000	10000	1	cash	270	2018-11-12
100002	1001	10001	2	card	150	2018-10-03
100003	1000	10001	2	card	200	2018-12-01
100004	1002	10002	3	cash	300	2018-07-20
100005	1003	10003	3	cash	276	2019-01-01
100006	1002	10003	2	card	99	2018-12-28
\.


--
-- Data for Name: curier; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.curier (curier_id, nume, adresa, cod_postal) FROM stdin;
1	Smart Curier 	Str. Vitezei, nr. 50, Brasov	225200
2	Koala 	Str. Scurta, nr. 2, Ploiesti	400520
3	Maxim Cargus	Str. Mare, nr. 100, Brasov	123455
4	Mega Transit	Str. Soarelui, nr. 21, Iasi	882952
5	Fast Delivery	Str. Portitei, nr. 1, Bucuresti	123512
6	24/7 Curier	Str. Bazinului, nr. 54, Timisoara	477589
\.


--
-- Data for Name: depozit; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.depozit (depozit_id, adresa, cod_postal) FROM stdin;
100	Str. Yahoo, nr.99, Bucuresti	613512
101	Str. Google, nr.32, Otopeni	123992
102	Str. Scurta, nr. 23, Comarnic	512421
103	Str. Mica, nr. 9, Timisoara	512412
104	Str. Lemnului, nr. 2, Vaslui	897123
\.


--
-- Data for Name: furnizor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.furnizor (furnizor_id, nume, adresa, telefon) FROM stdin;
10	Gukki	Str. Gorj, nr. 13, Sacele	0721694294
11	Tarhon	Str. Independentei, nr. 42, Posada	0746215466
12	Worldwide appareal	Str. Luminii, nr. 22, Campina	0726367732
13	All clothing	Str. Ielelor, nr. 8, Bucuresti	0737285372
14	Stan	Str. Bumbac, nr. 101, Craiova	0722520081
15	Budinque	Str. Vineri, nr. 5, Valcea	0788225002
16	Red Horse	Str. Rosie, nr. 222, Valcea	0765432122
\.


--
-- Data for Name: produs; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.produs (produs_id, nume, depozit_id, stoc_produs, pret_produs, marime, brand, aprovizionare_id) FROM stdin;
10000	Hanorac	100	0	120	12	Hanorak	500
10001	Geaca	101	10	243	4	Adidas	501
10002	Adidasi	102	61	280	39	Nike	\N
10003	Tricou	102	0	45	5	ERK	\N
10004	Blugi	103	5	140	32	Pepe	\N
\.


--
-- Name: aprovizionare aprovizionare_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aprovizionare
    ADD CONSTRAINT aprovizionare_pkey PRIMARY KEY (aprovizionare_id);


--
-- Name: client client_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (client_id);


--
-- Name: comanda comanda_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comanda
    ADD CONSTRAINT comanda_pkey PRIMARY KEY (comanda_id);


--
-- Name: curier curier_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curier
    ADD CONSTRAINT curier_pkey PRIMARY KEY (curier_id);


--
-- Name: depozit depozit_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.depozit
    ADD CONSTRAINT depozit_pkey PRIMARY KEY (depozit_id);


--
-- Name: furnizor furnizor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.furnizor
    ADD CONSTRAINT furnizor_pkey PRIMARY KEY (furnizor_id);


--
-- Name: produs produs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produs
    ADD CONSTRAINT produs_pkey PRIMARY KEY (produs_id);


--
-- Name: aprovizionare aprovizionare_furnizor_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aprovizionare
    ADD CONSTRAINT aprovizionare_furnizor_id_fkey FOREIGN KEY (furnizor_id) REFERENCES public.furnizor(furnizor_id);


--
-- Name: comanda comanda_client_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comanda
    ADD CONSTRAINT comanda_client_id_fkey FOREIGN KEY (client_id) REFERENCES public.client(client_id);


--
-- Name: comanda comanda_curier_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comanda
    ADD CONSTRAINT comanda_curier_id_fkey FOREIGN KEY (curier_id) REFERENCES public.curier(curier_id);


--
-- Name: comanda comanda_produs_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comanda
    ADD CONSTRAINT comanda_produs_id_fkey FOREIGN KEY (produs_id) REFERENCES public.produs(produs_id);


--
-- Name: produs legatura_aprov; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produs
    ADD CONSTRAINT legatura_aprov FOREIGN KEY (aprovizionare_id) REFERENCES public.aprovizionare(aprovizionare_id);


--
-- Name: aprovizionare legatura_produs; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aprovizionare
    ADD CONSTRAINT legatura_produs FOREIGN KEY (produs_id) REFERENCES public.produs(produs_id);


--
-- Name: produs produs_depozit_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.produs
    ADD CONSTRAINT produs_depozit_id_fkey FOREIGN KEY (depozit_id) REFERENCES public.depozit(depozit_id);


--
-- PostgreSQL database dump complete
--

