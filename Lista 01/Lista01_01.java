import java.util.Scanner;

class Lista01_01{
	public static void main (String[] args){
		double m_s; //metro por segundo
		double km_h; //km por hora
		Scanner ler = new Scanner(System.in);
		m_s = ler.nextFloat();
		km_h = m_s * 3.6;
		System.out.println("Valor: " + km_h);
	}
}