import java.util.*;
import java.io.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a[]=new int[t];
        int b[]=new int[t];
        int n[]=new int[t];
        
        for(int i=0;i<t;i++){
        a[i] = in.nextInt();
        b[i] = in.nextInt();
        n[i] = in.nextInt();
                
        }
        
        for(int k=0;k<t;k++) {
        	
        	 long total= a[k];
             for(int j=0;j<n[k];j++) {
             	
             	total += (long) (Math.pow(2, j) * b[k]);
             	System.out.print(total +" ");
             }
             System.out.println();
        }
        
        in.close();
        
       
    }
}
