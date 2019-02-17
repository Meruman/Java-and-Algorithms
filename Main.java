/**
 * Main class of the Java program. 
 * 
 */

public class Main {
    public static boolean isPrime(int n) {
        //your implementation goes here
    	for (int i=2; i<=n/2; i++) {
    		if (n%i==0) {
    			return false;
    		}
    	}
		return true;
    }
    
    public static int nextPrime(int n) {
        //your implementation goes here
    	boolean Prime = isPrime(n);
    	if (Prime) {
    		return n;
    	}
    	else {
    		n++;
    		return nextPrime(n);
    	}
    }
    
    public static int median(int a, int b, int c) {
        //your implementation goes here
    	if ((a<=b && a>=c)|| (a>=b && a<=c)) {
    		return a;
    	}
    	else if ((b<=a && b>=c)|| (b>=a && b<=c)) {
    		return b;
    	}
    	else {
    		return c;
    	}
    }
    
    public static int median2(int a, int b, int c) {
        //your implementation goes here
    	int media;
    	media = (a+b+c) - Math.min(Math.min(a, b), c) - Math.max(Math.max(a, b), c);
    	return media;
    }
   
    public static int[] createRandom (int n)  {
        //your implementation goes here
    	int [] randomArray = new int[n];
    	for (int i=0; i<n; i++) {
    		randomArray[i] = 5 + (int)(Math.random() * ((94) + 1));
    	}
    	return randomArray;
    }

    public static String toString (int[] a) {
        //your implementation goes here
    	String stringArray="[";
    	for (int i=0;i<a.length-1;i++) {
    		stringArray = stringArray + Integer.toString(a[i]) + ", ";
    	}
    	stringArray= stringArray + Integer.toString(a[a.length-1]) + "]";
    	return stringArray;
    }
    
    public static int posMin (int[] a) {
        //your implementation goes here
    	int position=0, currentNum=a[0];
    	for (int i=0; i<a.length-1;i++) {
    		if(currentNum>a[i+1]) {
    			currentNum = a[i+1];
    			position=i+1;
    		}
    	}
    	return position;
    }
    
    public static void swap (int[] a) {
        //your implementation goes here
    	int temp = a[0];
    	a[0] = a[a.length-1];
    	a[a.length-1] = temp;
    }

    public static void main(String[] args) {
        //test your methods here
    	int [] a = new int[] {9,5,4,8,4};
    	int t=posMin(a);
    	System.out.println(t);
    }
}

