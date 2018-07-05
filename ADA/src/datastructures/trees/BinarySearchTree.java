package datastructures.trees;

public class BinarySearchTree {

	Node root;
	Node curr = root;
	
	
	public Node getCurrRight() {
		return curr.rightChild;
	}
	
	public Node getCurrLeft() {
	return curr.leftChild;
	}
	
	public Node getRootRight() {
		return root.rightChild;
	}
	
	public Node getRootLeft() {
	return root.leftChild;
	}

	/*  public void insertFirst(int data)
	     {
	         root = insert1(root, data);
	     }*/
	
	private void insert1(int data)
    {
		
        /*if (root == null)			//root
            root = new Node(data);*/	//root  =  10 
        if(curr == null) {
        	curr = new Node(data);
        }
        
        else
        {
        	if(data <= curr.data) {
        		
            if (getCurrLeft() != null) {
               // node.right = insert(node.right, data);
                curr = curr.leftChild;
            }
            else
            	curr.leftChild = new Node(data);
            curr= root;
        	}
        	else {
        		
        		if (getCurrRight() != null) {
        		 curr = curr.rightChild;
        		}
        		else
                	curr.rightChild = new Node(data);
        		curr= root;
        	}
        }
    }   

	
	
	public void insert(int data) {
		
		if(curr == null) {
			curr = new Node(data);
		}
		
		
		else {
			if(data <= root.data) {
				if(root.leftChild == null) {
					root.leftChild = new Node(data);
				}
				else {
					curr = root.leftChild;
					insert(data);
				}
			}
			else {
				if(curr.rightChild == null) {
					curr.rightChild = new Node(data);
				}
				else {
					insert(data);
				}
			}
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bt = new BinarySearchTree();
		bt.insert(10);
		bt.insert(4);
		
		bt.insert(6);
		bt.insert(15);
	
		bt.insert(18);
	}
	
}
