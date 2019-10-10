import java.util.Scanner;

public class Test2 {
public static Scanner sc =new Scanner(System.in);



    public static void main(String[] args){
        String s =new String();
        System.out.println("Scrieti stringul :");
        s=sc.nextLine();
        System.out.println("Stringul este :"+s);
        char[] c=s.toCharArray();
        int voca=0, voce=0,voci=0,voco=0,vocu=0,sum=0;
        for (int i = 0; i <c.length ; i++) {
            switch(c[i]){
                case ('a'):
                    voca++;
                    sum++;
                    break;
                case 'e':
                    voce++;
                    sum++;
                    break;
                case 'i':
                    voci++;
                    sum++;
                    break;
                case 'o':
                    voco++;
                    sum++;
                    break;
                case 'u':
                    vocu++;
                    sum++;
                    break;
            }
        }
        System.out.println("Vocale:"+sum);
        System.out.println("Vocala a:"+voca);
    }
}
