package com.iag.poo.lab3.classes;

public class Player {
    private int id;
    private String name;
    private boolean status;

    public Player(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Player() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
