import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Demo {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

int pairs =0;
Map<Integer,Integer> socks =new HashMap<>();

for(int i=0;i<n;i++){
			if(socks.containsKey(ar[i]))
			{ 
				socks.put(ar[i],socks.get(ar[i])+1);
				}
			else {
				socks.put(ar[i],1);
			}
			 
}

Set set=socks.entrySet();
Iterator it =set.iterator();

while(it.hasNext()){
  Map.Entry entry=(Map.Entry)it.next();  
       pairs +=(int) entry.getValue()/2; 
}
return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     int ar[] = new int[]{1,1,2,2,1,1,5,6,2,5};
    	//int ar[] = new int[]{1,2,3,4,5,6,7,8,9,10};

        int result = sockMerchant(10, ar);

     System.out.println(result);
    }
}
