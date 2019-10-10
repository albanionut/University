import java.util.Scanner;

public class Problema7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String sir="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
		int lungime= sir.length();
		for (int i=0; i<lungime; i++) 
		{
			char 
			character= sir.charAt(i);
			int ascii= (int) character;
			System.out.println(character+" "+ascii);
			sc.close();
		}
	}
}