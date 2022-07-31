package com.yaseen.bst.services;

public class BST 
{
	public Node node;
	static Node prev = null;
	public Node headNode = null;

	//Function to flatten the Binary Search tree into a Skewed tree in Increasing order
	public  void flatten(Node root, int order) {

		//Base case
		if (root == null) {
			return;
		}

		//Condition to check the order in which the Skewed tree to maintained
		if (order > 0) {
			flatten(root.right, order);
		}
		else 
		{
			flatten(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		//Condition to check if the root Node of the Skewed tree is not defined
		if (headNode == null)
		{
			headNode = root;
			root.left = null;
			prev = root;
		}

		else 
		{
			prev.right = root;
			root.left = null;
			prev = root;
		}

		//Similarly recurse for the left / right Subtree on the basis of the order required
		if (order > 0) {
			flatten(leftNode, order);
		}
		else {
			flatten(rightNode, order);

		}
	}

	//Function to traverse the right skewed tree using recursion
	public  void traverseRightSkewed(Node root)
	{
		if ( root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);
	}

}

