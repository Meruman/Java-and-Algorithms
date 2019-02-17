// Main class of the Java program. 
 
import java.math.BigInteger;

public class Main {
    static int countRec=0, countIter=0;
    
    public static BigInteger facRec(int n) {
        //your implementation goes here 
    	
    	//First you declare the BigInteger number you will be using
    	BigInteger number = BigInteger.valueOf(n);
    	
    	//Then, if the attribute n given by the facRec call is equal to 0 stop the counter, display the value
    	//and return the value of 1
		if (n == 0) {  								
			System.out.println("Counter for Recursive: " + countRec);
			countRec = 0;
    		 return BigInteger.valueOf(1);}
		
		//else, if the attribute n given is not 0, then increase the counter because we are going to call
		//this same function again and then
		//return the number multiplied by the result from the function giving the n minus one as an attribute
		//This will stop until we reach the 0 value in n
    	else
    		//System.out.println("In this iteration the value of number is: " + number);
			countRec++;
    		 return number.multiply(facRec(n-1));
    }
    
    public static BigInteger facIter(int n) {
        //your implementation goes here   
    	 BigInteger Num=BigInteger.valueOf(1);
    	 for (int i=1; i<=n; i++) {
    		 countIter++;
    		 Num=Num.multiply(BigInteger.valueOf(i));
    	 }
    	 System.out.println("Counter for Iterative: " + countIter);
    	 countIter =0;
    	 return Num;
    }

    public static void main(String[] args) {
        //test your implementation here (also for classes Food and Clock)
    	//test for Main
    	// Test for the first 15!
    	 for (int i=0; i<=15;i++) {
    		 System.out.println(facRec(i));
    	}
    	BigInteger x;
    	x=facRec(23);
    	System.out.println(x);
    	BigInteger y;
    	y=facIter(23);
    	System.out.println(y);
   	
    	//Test for Clock 
    	Clock r=new Clock(13,8);
    	Clock y1 = new Clock(15,6);
    	String test = r.toString();
    	System.out.println(test);
    	r=r.add(26);
    	System.out.println(r);
    	y1=r.add(r);
    	System.out.println(y1);
    	System.out.println(r);
    	
    	Clock r1=new Clock(20,20);
    	Clock y12 = new Clock(12,8);
    	String test1 = r1.toString();
    	System.out.println(test1);
    	r1=r1.add(30);
    	System.out.println(r1);
    	y12=r.add(r1);
    	System.out.println(y12);
    	System.out.println(r1);
    	
    	Clock r12=new Clock(14,27);
    	Clock y123 = new Clock(19,40);
    	String test12 = r12.toString();
    	System.out.println(test12);
    	r12=r12.add(50);
    	System.out.println(r12);
    	y123=r.add(r12);
    	System.out.println(y123);
    	System.out.println(r12);

    	//Test for Food
    	
    	Food[] testfood = new Food[]{};
    	testfood =Food.createSortedRandomList();
    	for (int i=0;i<testfood.length;i++) {
    		System.out.println(testfood[i]);
    }
    }
}


