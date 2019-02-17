public class LinkedNode<E> {
    E data_;
    LinkedNode<E> next_;
    
    public LinkedNode(E data) {
        //your implementation goes here
    	
    	this.data_= data;
    	this.next_ = null;
    }
    
    public void setNextNode(LinkedNode<E> n_node) {
         //your implementation goes here
    	this.next_ = n_node;
    }
    
    public LinkedNode<E> getNextNode() {
         //your implementation goes here
    	return this.next_;
    }
    
    public String toText() {
        //your implementation goes here
    	LinkedNode<E> n; 
    	String output= ""+this.data_;
    	n = this.next_;			//First we have the next node from the node calling the function
    	while (n != null){ //Do it until next is null, this means we are at the tail
            output=output+", "+n.data_; 
            n = n.next_; //We update the next node with the next one
        } 
         
    	return output;
    }
}
