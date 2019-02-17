import java.util.Comparator;

public class Main {
	
	//Rule for comparator to be ascending
	public static Comparator<String> ascend = new Comparator<String>() {
         public int compare(String temp1, String temp2) {
             return temp1.compareTo(temp2);
         }
     };
     
   //Rule for comparator to be descending 
    public static Comparator<String> descend = new Comparator<String>() {
         public int compare(String temp1, String temp2) {
             return temp2.compareTo(temp1);
         }
     };

	public static <T extends Comparable<T>> void quickSort (T[] a) {
        //your implementation goes here
		qsort(a, 0, a.length -1);
	}
	public static <T extends Comparable<T>> void qsort(T[] arr, int first, int last) {
		int split = partition(arr, first, last);
		 if (first < split - 1) {
		 qsort(arr, first, split - 1);} //left subarray
		 if (split < last) {
		 qsort(arr, split, last);} //right subarray
	}
	
	public static <T extends Comparable<T>> int partition (T[] arr, int first, int last) {
		 int middle = (last+first)/2;
		 T pivot = arr[middle], temp; //pivot
		 int i = first; //index going left to right
		 int j = last; //index going right to left
		 
		 //System.out.println(pivot);
		 while (i <= j) {
		 
		 while (arr[i].compareTo(pivot)==-1) {
			 i++;
		 }
		 while (arr[j].compareTo(pivot)==1) {
			 j--;
		 }
		 if (i <= j) {
		 temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
		 i++;
		 j--;
		 } //swap
		 }
		 

		 return i; //new index of pivot
		}

	@SuppressWarnings("unchecked")
	public static <T> void mergeSort(T[] a, Comparator<T> c) {
	   //your implementation goes here
		_mergeSort(a, (T[]) new Object[a.length], 0, a.length - 1, c);
	}
	
	private static <T> void _mergeSort(T a[], T copy[], int start, int end, Comparator<T> c){
		if (start < end) {
			int mid = (start + end) / 2;
			_mergeSort(a, copy, start, mid,c);
			_mergeSort(a, copy, mid + 1, end,c);
			merge(a, copy, start, mid, end, c);
		}
	}
	
	private static <T> void merge(T a[], T copy[], int start, int m, int end,Comparator<T> c) {
		int i = 0, j = start, k;
		while (j <= m)
			copy[i++] = a[j++];
		i = 0;
		k = start;	
		while (k < j && j <= end) {
			if (c.compare(copy[i], a[j]) < 0)
				a[k++] = copy[i++];
			else
				a[k++] = a[j++];
		}
		while (k < j)
			a[k++] = copy[i++];
	}
	    

	public static void main(String[] args) {
        //test your functions here
		Clock[] array = new Clock[] {new Clock(11,12),new Clock(8,13),new Clock(12,13),new Clock(1,13)};
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");}
		quickSort(array);
		System.out.println();
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");}
		System.out.println();
		
		String[] things = {"pencil", "puddle", "food", "needle", "face","water", "thermometer", "candy", "floor", "newspaper", "apple", "rug","bed", "blouse"};
		
		for (int i=0; i<things.length;i++) {
			System.out.print(things[i]+" ");}
		System.out.println();
		System.out.println();
		System.out.println("Ascending order");

		 //Sorting in ascending order
        mergeSort(things, ascend);
        for (int i=0; i<things.length;i++) {
			System.out.print(things[i]+" ");}
        System.out.println();
        System.out.println();
        
        //Sorting in descending order
		System.out.println("Descending order");
        mergeSort(things, descend);
        for (int i=0; i<things.length;i++) {
			System.out.print(things[i]+" ");}
       
	}
}
