import java.util.LinkedList;

/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        //test your implementation here
    	LinkedTree<String> theTree= new LinkedTree<String>();
    	theTree.insert(16,"R");
    	theTree.insert(16,"D");
    	theTree.insert(16,"T");
    	
    	theTree.insert(23,"M");
    	theTree.insert(23,"I");
    	theTree.insert(23,"L");
    	
    	theTree.insert(42,"A");
    	theTree.insert(42,"H");
    	theTree.insert(42,"E");
    	
    	theTree.insert(8,"A");
    	theTree.insert(8,"C");
    	theTree.insert(8,"E");
    	
    	theTree.insert(15,"H");
    	theTree.insert(15,"O");
    	theTree.insert(15,"P");
    	
    	theTree.insert(4,"D");
    	theTree.insert(4,"R");
    	theTree.insert(4,"M");
    	
    	System.out.println(theTree.inorder(0));
    	System.out.println(theTree.postorder(1));
    	System.out.println(theTree.preorder(2));
    	
    	
    	
        }
}

