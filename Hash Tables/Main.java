/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        // test your implementation here
    	HashLinQuad linHashTable  = new HashLinQuad(1249);
    	HashLinQuad quadHashTable = new HashLinQuad(1249);
    	int sumlin=0;
    	int sumquad=0;
    	int number=0;
    	for (int i=0; i<1000;i++) {
    		number=(int)(Math.random()*1000);
    		int collitions = linHashTable.addLin(number);
    		sumlin=sumlin+collitions;
    		collitions = quadHashTable.addQuad(number);
    		sumquad = sumquad + collitions;
    	}
    	System.out.println(sumlin);
    	System.out.println(sumquad);
    	
    	
    	
    	 Food Apple = new Food("apple","fruit",10,15,true);
    	 Food Bannana = new Food("Bannana","fruit",10,35,true);
    	 Food orange = new Food("Orange","fruit",50,15,true);
    	 Food Pasta = new Food("Pasta","Italian",130,145,true);
    	 Food Bread = new Food("Bread","Bread",103,153,true);
    	 Food Pizza = new Food("Pizza","Italian",120,135,false);
    	 Food Curry = new Food("Curry","Sauce",120,135,false);
    	 Food Schnitzel = new Food("Schnitzel","meet",100,125,true);
    	 Food Pommes = new Food("Pommes","vegtables",100,25,false);
    	 Food Quesadilla = new Food("Quesadilla","Mexican",20,35,false);
    	 
    	 HashFridge fridge = new HashFridge(10);
    	 fridge.insert(Apple, 10);
    	 fridge.insert(Bannana, 10);
    	 fridge.insert(orange, 10);
    	 fridge.insert(Pasta, 10);
    	 fridge.insert(Bread, 10);
    	 fridge.insert(Pizza, 10);
    	 fridge.insert(Curry, 20);
    	 fridge.insert(Schnitzel, 40);
    	 fridge.insert(Pommes, 30);
    	 fridge.insert(Quesadilla, 20);
    	 System.out.println(fridge.toString());
    	 
    	 int amount = fridge.search(Pizza);
    	 System.out.println(amount);
    	 
    	 fridge.remove(Pizza, 10);
    	 System.out.println(fridge.toString());
    }
    
   
    
    
}

