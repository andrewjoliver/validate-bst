class Solution{
	public static boolean BSTHelper(Node node, int min, int max) {
		if (node == null) return true;

		if (node.data <= min || node.data >= max) return false;
		
		return true && BSTHelper(node.right, node.data, max)
					&& BSTHelper(node.left, min, node.data);
	}

	public static boolean isValidBST(Node root) {
		return BSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	static class Node { 
        int data; 
        Node right;
        Node left;
        Node(int val, Node rightChild, Node leftChild){
        	data = val;
        	right = rightChild;
        	left = leftChild; 
        }
    }
    public static void main(String args[]){
    	Node left2 = new Node(1, null, null);
    	Node left1 = new Node(3, null, left2);
    	Node right2 = new Node(9, null, null);
    	Node right1 = new Node(7, right2, null);
    	Node root = new Node(5, right1, left1);
    	System.out.println(isValidBST(root));
    }
}

