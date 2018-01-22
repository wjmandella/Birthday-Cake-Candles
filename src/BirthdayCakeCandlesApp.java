// My solution to the HackerRank problem "Birthday Cake Candles."
// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

import java.util.Scanner;

public class BirthdayCakeCandlesApp {

    static int birthdayCakeCandles(int n, int[] ar) {
    	int nbrOfCandles = 0;
    	int maxHt = 0;
    	for(int i=0; i<n; i++) {
    		maxHt = Math.max(maxHt, ar[i]);
    	}
    	System.out.println("Max HT: "+ maxHt);
    	for(int j=0; j<n; j++) {
    		if(ar[j] == maxHt)
    			nbrOfCandles++;
 	    	}
    	
    	return nbrOfCandles;    			
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	System.out.print("Enter an integer:");        
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
        	System.out.print("Enter an integer:");
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
    }

}
