import  java.util.Scanner;
public class ParesEImpares {

	
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		final int NUM = 20 ;
		int i, imp = 0, par = 0, a[], b[];
		
		
		a = new int [NUM];
		b = new int [NUM];
	
		for(i=0; i<NUM; i++) {
			
			System.out.println("digite o "+(i+1)+" numero");
			a[i] = num.nextInt(); 
				
				if (a[i] % 2 == 0) {
					par++;
				}	
				else {
					imp++;
				}
		}
		
		int dPar = 0;
		int dImpar = par;
		
		for (i=0; i<NUM; i++) {
			if (a[i] % 2 == 0) {
			b[dPar] = a[i];
			dPar++;
			}else {
				b[dImpar] = a[i];
				dImpar++;
			}	
			
		}
		
		
		
		for(i=0; i<NUM; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println("\nNumero pares: "+par);
		System.out.println("Numero impares: "+imp);
		
		}
	
	
	}



// pra numero par: N/2*N = N
