import java.util.Scanner;

class Lista01_07{
	public static void main (String [] args){
		int nota;
		Scanner ler = new Scanner(System.in);
		nota = ler.nextInt();
		conceitoAluno(nota);
		
	}
	
	static void conceitoAluno(int nota){
		if (nota <= 49){
			System.out.println("Insuficiente");
		}else if (nota >= 50 && nota <= 64){
			System.out.println("Regular");
		}else if(nota >= 65 && nota <= 84){
			System.out.println("Bom");
		}else{ 
			System.out.println("Otimo");
		}
		
	}
}