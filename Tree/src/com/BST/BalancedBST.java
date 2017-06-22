package com.BST;

import java.util.Vector;

public class BalancedBST {
	Node root;
	
	void storeBstIntoArray(Node root ,Vector<Node> nodes){
		if(root==null){
			return;
		}
		storeBstIntoArray(root.left, nodes);
		nodes.add(root);
		storeBstIntoArray(root.right, nodes);
	}
	
	Node buildBinaryTree(Vector<Node> nodes , int start , int end){
		if(start>end){
			return null;
		}
		int mid = (start+end)/2;
		Node node=nodes.get(mid);
		node.left = buildBinaryTree(nodes, start, mid-1);
		node.right = buildBinaryTree(nodes, mid+1, end);
		return node;
	}
	Node buildBinaryTreeUtil(Node root)
	{
		Vector<Node> nodes = new Vector<Node>();
		storeBstIntoArray(root, nodes);
		int n = nodes.size();
		return buildBinaryTree(nodes , 0 , n-1);
	}
	void preorder(Node node){
		if(node==null){
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
	}
	
	public static void main(String arg[]){
		BalancedBST bst = new BalancedBST();
		bst.root = new Node(10);
		bst.root.left = new Node(8);
		bst.root.left.left  = new Node(7);
		bst.root.left.left.left  = new Node(6);
		bst.root.left.left.left.left  = new Node(5);
		bst.preorder(bst.root);
		bst.root = bst.buildBinaryTreeUtil(bst.root);
		bst.preorder(bst.root);
	}
}
