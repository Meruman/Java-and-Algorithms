public class HashFridge {
	// Do not forget to add appropriate attributes and constructors right here
	private Food[] table;        //hash table
	private int[] amount;          
	private int capacity;
	
	public HashFridge() {
	    // your implementation goes here
		table = new Food[10];
		amount = new int[10];
	    capacity = 10;
	    for (int i = 0; i < 10; i++)
            table[i] = null;
	   
	}
	
	public HashFridge(int cap) {
	    // your implementation goes here
		table = new Food[cap];
		amount = new int[cap];
	    capacity = cap;

	    for (int i = 0; i < cap; i++)
	    	table[i] = null;
	}
	
	public void insert(Food obj, int value) {
		// your implementation goes here
		int index=obj.hashCode();
		int modul=index;
		if(index>capacity) {
		modul=index%capacity;}
		if(table[modul] == null || table[modul].equals(obj)) {
			table[modul]=obj;
			amount[modul]+=value;
			}
		else {
			   while(table[modul]!=null) {
				   modul++;
				   if(modul >=capacity) {
					   modul=0;
				   }
			   }
			   table[modul] =obj;
			   amount[modul]+=value;
		   }
	}
	
	public int search(Food obj) {
		// your implementation goes here
		int index=obj.hashCode();
		int modul=index;
		int times=0;
		if(index>capacity) {
		modul=index%capacity;}
		if(table[modul].equals(obj)) {
			return amount[modul];
			}
		else {
			   while(table[modul]!=obj) {
				   modul++;
				   if(modul >=capacity) {
					   modul=0;
					   times++;
					   if(times ==2) {
						   return -1;
					   }
				   }
			   }
			   return amount[modul];
			   }
		
	}
	
	public void remove(Food obj, int value) {
		// your implementation goes here
		int index=obj.hashCode();
		int modul=index;
		int times=0;
		if(index>capacity) {
		modul=index%capacity;}
		if(table[modul].equals(obj)) {
		  amount[modul]=amount[modul] - value;
		  if(amount[modul]<=0) {
			  amount[modul]=-1;
			  table[modul] = null;
		  }
			}
		else {
			   while(table[modul]!=obj) {
				   modul++;
				   if(modul >=capacity) {
					   modul=0;
					   times++;
					   if(times ==2) {
						   break;
					   }
				   }
			   }
			   amount[modul]=amount[modul] - value;
				  if(amount[modul]<=0) {
					  amount[modul]=-1;
					  table[modul] = null;
				  }
			   }
}
	public String toString() {
		String s="";
		for(int i=0; i<table.length;i++) {
			if (table[i] !=null) {
			s+=table[i].toString() + " quantity = " + amount[i] + ", ";}
		}
		return s;
	}
	}
