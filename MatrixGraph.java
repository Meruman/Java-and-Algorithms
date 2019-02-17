import java.util.List;
import java.util.LinkedList;

public class MatrixGraph {
    public int inDegree(int vertex, int[][] edge) {
        //your implementation goes here
    	int count=0;
    	for(int i=0; i<edge.length; i++) {
    		if(edge[i][vertex] == 1) {
    			count+=1;
    		}
    	}
    	return count;
    }
    
    public int outDegree(int vertex, int[][] edge) {
        //your implementation goes here
    	int count=0;
    	for(int i=0; i<edge[vertex].length; i++) {
    		if(edge[vertex][i] == 1) {
    			count+=1;
    		}
    	}
    	return count;
    }
    
    public List<Integer> adjacent(int vertex, int[][] edge) {
        //your implementation goes here
    	List<Integer> vertices = new LinkedList<Integer>();
    	for(int i=0; i<edge[vertex].length; i++) {
    		if(edge[vertex][i] == 1) {
    			vertices.add(i);
    		}
    	}
    	return vertices;
    }
}
