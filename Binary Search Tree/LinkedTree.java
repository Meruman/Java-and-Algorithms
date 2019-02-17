import java.util.LinkedList;

public class LinkedTree<E> {
    Node<E> root;
    LinkedList<E> resultData=new LinkedList<E>();
    LinkedList<E> deletedData = new LinkedList<E>();

    private class Node<E> {
        private int key; //the key field
        private LinkedList<E> data; //list of data associated with a key
        private Node<E> left; //reference to the left child
        private Node<E> right; //reference to the right child
    
        private Node(int key, E element, Node<E> leftChild, Node<E> rightChild) {
            this.key = key;
            this.data = new LinkedList<E>();
            this.left = leftChild;
            this.right = rightChild;

            this.data.add(element);
        }
        
    }
    
    public LinkedTree() {
        //your implementation goes here
    	root =null;
    }
    
    public LinkedTree(int key, E element) {
        //your implementation goes here
    	root=new Node<E>(key,element,null,null);
    }
    
    public void insert(int key, E element) {
        //your implementation goes here
    	Node<E> findNode = root;
    	if (findNode==null) {
			root=new Node<E>(key,element,null,null);
		}
    	else {
    	while (findNode.key!=key) {
    		Node<E> Parent=findNode;
    		if(key<findNode.key) {
    			findNode=findNode.left;
    			if(findNode==null) {
        			Node<E> newNode = new Node<E>(key,element,null, null);
        			Parent.left = newNode;
        			break;
        		}
    		}
    		else {
    			findNode=findNode.right;
    			if(findNode==null) {
        			Node<E> newNode = new Node<E>(key,element,null, null);
        			Parent.right = newNode;
        			break;
        		}
    		}
    	}
    	}
    	if(findNode!=null) {
    		findNode.data.add(element);
    	}
    	
    }
    
    public LinkedList<E> search(int key) {
        //your implementation goes here
    	Node<E> findNode = root;
    	if (findNode==null) {
			return null;
		}
    	while (findNode.key!=key) {
    		if(key<findNode.key) {
    			findNode=findNode.left;
    		}
    		else {
    			findNode=findNode.right;
    		}
    		if(findNode == null) {
    			return null;
    		}
    	}
    	return findNode.data;
    }
    
    public LinkedList<E> preorder(int ind) {
        //your implementation goes here
    	resultData=new LinkedList<E>();
    	doPreorder(this.root,ind); 	
    	return resultData;
    	
    }
    public void doPreorder(Node<E> theRoot, int ind) {
    	if (theRoot!=null) {
    		if(theRoot.data.size()>ind) {
    			resultData.add(theRoot.data.get(ind));
    		}
    		doPreorder(theRoot.left, ind);
    		doPreorder(theRoot.right, ind);
    	}
    }

    public LinkedList<E> postorder (int ind) {
        //your implementation goes here
    	resultData=new LinkedList<E>();
    	doPostorder(this.root,ind); 	
    	return resultData;
    }
    
    public void doPostorder(Node<E> theRoot, int ind) {
    	if (theRoot!=null) {
    		doPostorder(theRoot.left, ind);
    		doPostorder(theRoot.right, ind);
    		if(theRoot.data.size()>ind) {
    			resultData.add(theRoot.data.get(ind));
    		}
    	}
    }

    public LinkedList<E> inorder (int ind) {
        //your implementation goes here
    	resultData=new LinkedList<E>();
    	doInorder(this.root,ind); 	
    	return resultData;
    }
    
    public void doInorder(Node<E> theRoot, int ind){
    	if (theRoot!=null) {
    		doInorder(theRoot.left, ind);
    		if(theRoot.data.size()>ind) {
    			resultData.add(theRoot.data.get(ind));
    		}
    		doInorder(theRoot.right, ind);
    	}
    }
    
    public LinkedList<E> delete(int key) {
        //your implementation goes here 
        deletedData = new LinkedList<E>();    
    	root= deleteRec(root, key); 
        return deletedData;
        } 
      
        
    public Node<E> deleteRec(Node<E> theRoot, int key) 
        { 
            // Case: If the tree is empty
            if (theRoot == null) {
            	return theRoot; 
            }
      
            // Otherwise, go down the tree
            //Go left:
            if (key < theRoot.key) {
            	theRoot.left = deleteRec(theRoot.left, key);
            }                 
            //Go right:
            else if (key > theRoot.key) {
            	theRoot.right = deleteRec(theRoot.right, key); 
            }
      
            // if key is same as theRoot's key, then This is the node 
            // to be deleted 
            else
            { 
                // node with only one child or no child 
                if (theRoot.left == null) {
                	//If we haven't delete anything, then save the deleted data
                	if(deletedData.size()==0) {
                	deletedData.add(theRoot.data.element());}
                	//Otherwise, just return the node
                    return theRoot.right; }
                else if (theRoot.right == null) {
                	//If we haven't delete anything, then save the deleted data
                	if(deletedData.size()==0) {
                	deletedData.add(theRoot.data.element());}
                	//Otherwise, just return the node
                	return theRoot.left; }
      
                // node with two children: find the successor...
                
                //Add the data that will be deleted to our deleted list
                deletedData.add(theRoot.data.element());
                //Get the smallest number in the right subtree
                int nextKey = minValue(theRoot.right);
                
                //Exchange the data, for the successor data
                theRoot.data= nextData(theRoot.right);
                //Exchange the key for the successor key
                theRoot.key=nextKey;
                
                // Delete the successor 
                theRoot.right = deleteRec(theRoot.right, theRoot.key); 
            } 
            
            return theRoot;
        } 
    LinkedList<E> nextData(Node<E> theRoot) 
    { 
        LinkedList<E> nextData = theRoot.data; 
        while (theRoot.left != null) 
        { 
            nextData = theRoot.left.data; 
            theRoot = theRoot.left; 
        } 
        return nextData; 
    } 
      
        int minValue(Node<E> theRoot) 
        { 
            int minv = theRoot.key; 
            while (theRoot.left != null) 
            { 
                minv = theRoot.left.key; 
                theRoot = theRoot.left; 
            } 
            return minv; 
        } 
}
