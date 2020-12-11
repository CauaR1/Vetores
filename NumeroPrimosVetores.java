import java.util.Scanner;

public class NumeroPrimosVetores {

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		
	int i, b, a[];
		final int NUM = 10;
		a = new int [NUM];
		
		for (i=0; i<NUM; i++) {
			
			System.out.println("Digite um número: ");
			
			a[i] = num.nextInt();
			int resto = 0;
			for (b=1; b<a[i]; b++) {
				if (a[i] % b == 0) {
					resto++;
				}
			}
			if (resto >= 2) {
				System.out.println("o número " +a[i] +" não é primo");
			} else {
					System.out.println("o numero " +a[i] +" é primo \n");
				}
			}
		}
		
		
	}