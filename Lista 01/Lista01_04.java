import java.util.Scanner;

class Lista01_04{
	public static void main (String [] args){
		float nota1, nota2, nota3, nota4, media;
		
		Scanner ler = new Scanner(System.in);
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if (media >=7){
			System.out.println("Aprovado");
		}else if (media >=5 && media <7){
			System.out.println("Fazer final");
		}else{
			System.out.println("Reprovado");
		}
	}
}