import java.util.Scanner;
import java.util.Calendar;

class Lista01_02{
	public static void main (String [] args){
	int idade;
	Calendar c = Calendar.getInstance();	
	Scanner ler = new Scanner (System.in);
	
	System.out.print("Digite o seu ano de nascimento: ");
	idade = ler.nextInt();
	idade = c.get(Calendar.YEAR) - idade;
	
	System.out.println("A idade e: " + idade);
	
	}

}