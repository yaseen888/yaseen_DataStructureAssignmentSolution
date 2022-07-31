package com.yaseen.bst.main;

import com.yaseen.bst.services.BST;
import com.yaseen.bst.services.Node;

public class Driver {

	public static void main(String[] args) {

		//creating object for BST class
		BST tree = new BST();

		//hardcoded input of tree
		tree.node = new Node(50);
		tree.node.left = new Node (30);
		tree.node.right = new Node (60);
		tree.node.left.left = new Node (10);
		tree.node.right.left = new Node (55);

		//calling methods of BST class
		int order = 0;
		tree.flatten(tree.node,order);
		tree.traverseRightSkewed(tree.headNode);

	}


}
