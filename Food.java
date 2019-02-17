import java.util.*;

public class Food implements Comparable<Food> {
    private String name = "";
    private int calories = 0;

	public Food(int calories, String name) {
        //your implementation goes here
		this.calories=calories;
		this.name=name;
	}

	public int compareTo(Food o) {
        //your implementation goes here
		int criteria1=this.name.length()*this.calories;
		int criteria2=o.name.length()*o.calories;
		if (criteria1 == criteria2) 
			return 0;
		else if (criteria1 > criteria2)
			return 1;
		else
			return -1;
	}

	public int getCalories() {
        //your implementation goes here
		return calories;
	}

	public static Food[] createSortedRandomList() {
        //your implementation goes here
		int random = (int) (Math.random()*101);
		Food[] array = new Food[random];
		for (int i = 0; i <= random-1; i++) {
			int random1 = (int) (Math.random()*101);
			if (random1 <= 25) {
				Food Apple = new Food (random1*25*i,"Apple");
				array [i] = Apple;
			}
			else if ((random1 > 25) && (random1 <=50)) {
				int z= (int) (Math.random()*100);
				Food Banana = new Food (random1*z*i,"Banana");
				array [i] = Banana;
			}
			else if ((random1 > 50) && (random1 <=75)) {
				int z= (int) (Math.random()*100);
				Food Orange = new Food (random1*z*i+3,"Orange");
				array [i] = Orange;
			}
			else if((random1 > 75) && (random1 <=100)) {
				int z= (int) (Math.random()*100);
				Food Lemon = new Food (random1*z,"Lemon");
				array [i] = Lemon;
			}
			
			
		}
		Arrays.sort(array);
		return array;
	}

	public String toString() {
        //your implementation goes here
		String namecalories = name + ":" + calories;
		return namecalories;
	}
}

