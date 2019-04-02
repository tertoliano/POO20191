import java.util.Scanner;

class Lista01_06{
	public static void main (String [] args){
		String nome;
		int qnt_diarias;
		int diaria = 60;
		double conta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o nome: ");
		nome = ler.next();
		
		System.out.print("Quantidade de diarias: ");
		qnt_diarias = ler.nextInt();
		
		conta = contaCliente(qnt_diarias, diaria);
		
		System.out.println("Cliente: " + nome);
		System.out.println("Valor total: " + conta);
		
	
	}
	
	static double contaCliente(int qnt_diarias, int diaria){
		int taxa;
		double soma;
		if (qnt_diarias > 15){
			taxa = 5;
		}else if (qnt_diarias == 15){
			taxa = 6;
		}else{
			taxa = 8;
		}
		soma = (qnt_diarias * diaria) + (qnt_diarias * taxa);
		
		return soma ;
	}
}