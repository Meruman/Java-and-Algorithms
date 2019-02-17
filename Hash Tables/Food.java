public class Food {

	   private String name; //name of the food          
	   private String category; //the category of food (en.wikipedia.org/wiki/List_of_foods)
	   // put three further attributes here
	   private int calories;
	   private int weight;
	   private boolean healty;
	   //public int amount=0;
	   
	   public Food() {
		   this.name="Banana";
		   this.category="Edible plants";
		   this.calories=10;
		   this.weight=1;
		   this.healty=true;
	   }
	   
	   public Food(String name, String category, int calories, int weight, boolean healty) {
	       // your implementation goes here
		   this.name=name;
		   this.category=category;
		   this.calories=calories;
		   this.weight=weight;
		   this.healty=healty;
	   }
	   
	   public String toString() {
		   // your implementation goes here
		   String converter="";
		   converter=converter + name +" " + category+" " + calories+" " + weight+" " + healty;
		   return converter;
	   }
	   
	   public int hashCode() {
		// your implementation goes here
		   int totalSize = category.length()+name.length()+calories+weight;
		   if (healty ==true) {
			   totalSize=totalSize/2;
		   }
		   else {
			   totalSize=totalSize/3;
		   }
		   return totalSize;
	   }
	   public boolean equals(Food x) {
		   boolean isEqual=false;
		   if (this.name==x.name && this.category==x.category&& this.calories==x.calories 
				   && this.weight==x.weight&&this.healty==x.healty) {
			   isEqual=true;
		   }
		   
		   return isEqual;
	   }
}
