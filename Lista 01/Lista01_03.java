import java.util.Scanner;

class Lista01_03{
	public static void main (String [] args){
	int peso1 = 2 , peso2 = 3, peso3 = 5;
	float nota1, nota2, nota3, media;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.print("Digite a nota 1: ");
	nota1 = ler.nextFloat();
	System.out.print("Digite a nota 2: ");
	nota2 = ler.nextFloat();
	System.out.print("Digite a nota 3: ");
	nota3 = ler.nextFloat();
	
	media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1 + peso2 + peso3);
	System.out.println("A media e: " + media);
	}
}