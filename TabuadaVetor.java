import java.util.Scanner;
public class TabuadaVetor {

	
		public static void main (String []args) {
			Scanner num = new Scanner(System.in);
			final int NUM = 5;
			int i, a[], b[];
			a = new int [NUM];
			
			for(i=0; i<NUM; i++) {
				System.out.println("digite o "+(i+1)+" numero");
				a[i] = num.nextInt();
			
				System.out.println("a tabuada de "+a[i]+" é:");
				System.out.println("1x"+(i+1)+"="+a[i]*1);
				System.out.println("2x"+(i+2)+"="+a[i]*2);
				System.out.println("3x"+(i+3)+"="+a[i]*3);
				System.out.println("4x"+(i+4)+"="+a[i]*4);
				System.out.println("5x"+(i+5)+"="+a[i]*5);
				System.out.println("6x"+(i+6)+"="+a[i]*6);
				System.out.println("7x"+(i+7)+"="+a[i]*7);
				System.out.println("8x"+(i+8)+"="+a[i]*8);
				System.out.println("9x"+(i+9)+"="+a[i]*9);
				System.out.println("10x"+(i+10)+"="+a[i]*10);
			}
	
			for(i=0; i<NUM; i++) {
	
				
				
			}
	
	
	
		}
}
