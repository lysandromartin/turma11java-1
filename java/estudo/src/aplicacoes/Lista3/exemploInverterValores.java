package aplicacoes.Lista3;
import java.util.Scanner;
public class exemploInverterValores {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("LEIA A:");
		a = leia.nextInt();
		System.out.println("LEIA B:");
		b = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERS�O A: %d B: %d",a,b);
		c = a;
		a = b;
		b = c;
		System.out.println();
		System.out.printf("VALORES AP�S A INVERS�O A: %d B: %d",a,b);
		leia.close();

		}
	}