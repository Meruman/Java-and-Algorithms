/**
 * Main class of the Java program. 
 * 
 */
 
import java.util.*;

public class Main {
    
    public static boolean isPalindrome (String str) {
        //your implementation goes here
    	boolean Palindrom=false;
    	String input = str.replaceAll("[^a-zA-Z0-9]", ""), reverse = "";//ReplaceAll, replace the first argument with the second, [^a-zA-Z0-9] means everything except a-z, A-Z and numbers
    	Stack<Character> stack = new Stack<Character>(); //Character, needed to parameterize the stack
    	for(int i=0;i<input.length();i++) {
    		stack.push(input.charAt(i));
    	}
    	while (stack.isEmpty()==false) {
    		reverse=reverse + stack.pop();
    	}
    	if (input.equalsIgnoreCase(reverse)) {//tests for value equality (whether they are logically "equal"), whereas == tests for reference equality (whether they are the same object). 
    		Palindrom=true;
    	}
    	
    	return Palindrom;
    }

    public static <E> void main(String[] args) {
///////////////////////First test for LinkedNode //////////////////////////////////////////
    	
		LinkedNode<String> first = new LinkedNode<String>("sleeping late"),
						   second = new LinkedNode<String>("attending a party"),
						   third = new LinkedNode<String>("going to bed"),
						   four = new LinkedNode<String>("visit the canteen"),
						   five = new LinkedNode<String>("attend a lecture"),
						   six = new LinkedNode<String>("skip a lecture"),
						   seven = new LinkedNode<String>("skip an excersise"),
						   eight = new LinkedNode<String>("have an ill"); 
    	  
        first.setNextNode(second); //Reference first's next node to the second LinkedNode
        second.setNextNode(third); //Reference Second's next node to the third LinkedNode
        String b = first.toText();
        System.out.println(b);
        System.out.println();
        third.setNextNode(four);
        four.setNextNode(five);
        five.setNextNode(six);
        six.setNextNode(seven);
        seven.setNextNode(eight);
        System.out.println(first.toText());
        System.out.println();
         
/////////////////////////Second test for LinkedNode///////////////////////////////////////////////// 
         
         LinkedNode<String> Monday = new LinkedNode<String>("Monday"),
				   			Thursday = new LinkedNode<String>("Thursday"),
				   			Friday = new LinkedNode<String>("Friday"),
				   			Tuesday = new LinkedNode<String>("Tuesday"),
				   			Wednesday = new LinkedNode<String>("Wednesday");
         Monday.setNextNode(Thursday);
         Thursday.setNextNode(Friday);
         System.out.println(Monday.toText());
         Monday.setNextNode(Tuesday);
         Tuesday.setNextNode(Wednesday);
         Wednesday.setNextNode(Thursday);
         System.out.println();
         System.out.println(Monday.toText());
         
/////////////////////////Test for Palindrome  /////////////////////////////////////////////7         
         
         String testPal="Hannah";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
         testPal="Rats live on no evil star.";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
         testPal="A man, a plan, a canal: Panama.";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
         testPal="Madam, I’m Adam";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
         testPal="Was it a car or a cat I saw?";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
         testPal="This is not a palindrome@";
         System.out.println();
         System.out.println(testPal +"  is palindrome?  "+ isPalindrome(testPal));
         
    }
}

