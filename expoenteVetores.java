import java.util.Scanner;
import java.lang.Math;

public class expoenteVetores {
    public static void main(String[] args) {
        Scanner Num = new Scanner (System.in);
    
    final int NUM = 11;
    int i, a[];
    double pot;
    
    a = new int [NUM];
    
    
    for (i=0; i<NUM; i++) {
    System.out.println("escreva o numero");
    a[i] = Num.nextInt();
    
        
    	pot = Math.pow (2, a[i]);
    	System.out.print(pot + "\n");
    }
    }
}
