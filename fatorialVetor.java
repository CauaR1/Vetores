import java.util.Scanner;
public class fatorialVetor {
public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		final int NUM = 15;
		int a[], b[], i, fatorial = 1;
		double F;


		a = new int[NUM];
		b = new int[NUM];
		
		for (i=0; i<NUM; i++) {
			
			System.out.println("Escreva o n�mero: ");
			a[i] = num.nextInt();
			
			fatorial = a[i];
			
			F = a[i]-1;
			if (a[i]<1){
				System.out.println("Este n�mero n�o tem fatorial!");
			}
			else { do{
			
				
				fatorial = (int) (F * fatorial);
				
				b[i] = fatorial;
				
				F--;
			
			}while (F>=1);
		System.out.println("O fatorial �: "+b[i]);
			}

	    }
	}
}