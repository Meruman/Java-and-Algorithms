/**
 * Main class of the Java program. 
 * 
 */

public class Main {

    public static void main(String[] args) {
        //test your implementation here
    	MatrixGraph graph = new MatrixGraph();
    	int[][] matrix = new int[6][6];
    	matrix[0][0]=1;
    	matrix[0][1]=1;
    	matrix[0][3]=1;
    	matrix[1][2]=1;
    	matrix[1][3]=1;
    	matrix[1][4]=1;
    	matrix[2][5]=1;
    	matrix[3][0]=1;
    	matrix[4][5]=1;
    	matrix[5][3]=1;
    	System.out.println(graph.inDegree(3, matrix));
    	System.out.println(graph.outDegree(5, matrix));
    	System.out.println(graph.adjacent(1, matrix));
    }
}

