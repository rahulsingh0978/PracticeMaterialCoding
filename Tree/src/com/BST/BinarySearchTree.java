package com.BST;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class BinarySearchTree {
	Node root;
	int kThSmallestElement(Node root , int k){
		Node curr,prev ;int count =0 ,ksmall = Integer.MIN_VALUE;
		if(root==null)
			return -1;
		curr=root;
		while(curr!=null){
			if(curr.left == null){
				count++;
				if(count == k){
					ksmall=curr.data;
				}
				curr=curr.right;
			}
			else{
				prev = curr.left;
				while(prev.right != null & prev.right != curr){
					prev=prev.right;
				}
				if(prev.right == null){
					prev.right = curr;
					curr= curr.left;
				}
				else{
					prev.right = null;
					count++;
					if(count ==k)
						ksmall=curr.data;
					curr = curr.right;
				}
			}
		}
		return ksmall;
	}
	void MorrisTNode(Node root){
		Node curr;
		Node prev;
		if(root == null)
			return ;
		curr = root;
		while(curr!= null){
			if(curr.left == null){
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
			else{
				prev = curr.left;
				while(prev.right!= null && prev.right!=curr){
					prev = prev.right;
				}
				
				if(prev.right == null){
					prev.right = curr;
					curr=curr.left;
				}
				else{
					prev.right = null;
					System.out.print(curr.data+" ");
					curr=curr.right; 	
				}
			}
		}
		
	}
	static Node head;
	Node insert(Node node , int data){
		if(node==null){
			return new Node(data);
		}
		else{
		if(data<=node.data ){
			node.left = insert(node.left , data);
		}
		else {
			node.right = insert(node.right , data);
		}
		
		return node;
		}
	}
	
	
	int minValue(Node node){
		Node current = node;
		while(current.left !=null){
			current = current.left;
		}
		return current.data;
	}
	
	
	public static void main(String arg[]){
		BinarySearchTree bst = new BinarySearchTree();
		//Node root =null;
		/*root = bst.insert(root, 23);
		bst.insert(root, 45);
		bst.insert(root, 12);
		bst.insert(root, 67);
		bst.insert(root, 11);
		bst.insert(root, 33);
		bst.insert(root, 10);*/
		bst.root=new Node(4);
		bst.root.left = new Node(2);
		bst.root.left.left = new Node(1);
		bst.root.left.right=new Node(0);
		bst.root.right=new Node(6);
		bst.root.right.left = new Node(5);
		bst.MorrisTNode(bst.root);
		System.out.print(bst.kThSmallestElement(bst.root, 9));
		//System.out.println("Minimum value is" + bst.minValue(root));
		
	}
}
