
public class HashLinQuad {
	   private int[] table;        //hash table
	   private int size;           //current number of elements          
	   private int capacity;        //capacity of the hash table
	   
	   public HashLinQuad (int _size) {
	      table = new int[_size];
	      this.size = 0;
	      capacity = _size;
	      
	      for (int i = 0; i < _size; i++)
            table[i] = -1;
	   }

	   public int addLin (int obj) { 
	      //add obj into table using linear probing
		   int modul=obj%capacity;
		   int colitions =0;
		   if(size<capacity) {
		   if (table[modul]==-1) {
			   table [modul]=obj;
			   this.size++;
		   }
		   else {
			   while(table[modul]!=-1) {
				   modul++;
				   colitions++;
				   if(modul >=capacity) {
					   modul=0;
				   }
			   }
			   table[modul] =obj;
			   this.size++;
		   }
		   return colitions;
	   }
		   else{
			return colitions;   
		   }
	   }
	   
	   public int addQuad (int obj){ 
	      //add obj into table using quadratic probing
		   int modul=obj%capacity;
		   int colitions =0;
		   if(size<capacity) {
		   if (table[modul]==-1) {
			   table [modul]=obj;
			   this.size++;
		   }
		   else {
			   int temp2=0;
			   int search=modul;
			   while(table[search]!=-1) {
				   temp2++;
				   search = modul+(temp2*temp2);
				   colitions++;
				   if(search >=capacity) {
					   modul=0;
					   temp2=1;
				   }
			   }
			   table[search] =obj;
			   this.size++;
		   }
		   return colitions;
	   }
		   else{
			return colitions;   
		   }
		   }
	   
	
}
