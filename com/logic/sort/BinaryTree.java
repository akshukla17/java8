package com.logic.sort;

import java.util.Scanner;

public class BinaryTree {

	public static void main(String[] args) {
		BinaryTreeOperation bt = new BinaryTreeOperation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Binary tree test \n");
		boolean ch = true;
		do {
			System.out.println("\nBinary Tree Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. search");
			System.out.println("3. Do you want default insertion ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the data for insertion ");
				bt.insertNode(sc.nextInt());
				bt.printNode();
				break;
			case 2:
				System.out.println("Enter the search value");
				int data=sc.nextInt();
				System.out.println(data +" is found in the tree : "+bt.searchData(data));
				break;
			case 3:
				int[] arr = {12,34543,23,45,3,1,54,665,34,7,8,345,45};
				for (int i = 0; i < arr.length; i++) {
					System.out.print("\ninserting elements "+arr[i]+"  ");
					bt.insertNode(arr[i]);
					bt.printNode();
				}
				
				System.out.println(" \n 2 is found in the tree : " + bt.searchData(2));
				System.out.println(" \n 5 is found in the tree : " + bt.searchData(5));
				break;
			}
			System.out.println("**************Print Binary tree********************************");
			bt.printNode();

			System.out.println("\nIf you want more operation then put true or else false");
			ch = sc.nextBoolean();
		} while (ch == true);
		sc.close();

	}
}

class BinaryTreeOperation {
	Node root = null;

	public BinaryTreeOperation() {

	}

	public void insertNode(int value) {
		root = insert(root, value);
	}

	public Node insert(Node node, int value) {
		if (node == null)
			node = new Node(value);
		else {
			if (node.left == null) {
				node.left = insert(node.left, value);
			} else if (node.right == null) {
				node.right = insert(node.right, value);
			} else {
				node.left.left = insert(node.left.left, value);
			}

		}
		return node;
	}

	public void printNode() {
	/*	System.out.println("\nPre order traversal");
		preOrderPrint(root);
*/
		System.out.println("\nIn order traversal\n");
		inOrderPrint(root);
		/*System.out.println("\nPost order traversal");
		postOrderPrint(root);*/
	}
	public void inOrderPrint(Node node) {
		if (node != null) {
			inOrderPrint(node.left);
			System.out.print(node.data + " ");
			inOrderPrint(node.right);
		}

	}
	public void preOrderPrint(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrderPrint(node.left);
			preOrderPrint(node.right);
		}
	}

	

	private void postOrderPrint(Node node) {
		if (node != null) {
			postOrderPrint(node.right);
			postOrderPrint(node.left);
			System.out.print(node.data + " ");
		}
	}

	public boolean searchData(int value) {
		return search(root, value);
	}

	private boolean search(Node node, int value) {
		if (node != null) {
			if (node.getData() == value)
				return true;
			if (search(node.left, value))
				return true;
			if (search(node.right, value))
				return true;
		}
		return false;
	}

}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int n) {
		left = null;
		right = null;
		this.data = n;
	}

	public Node() {
		left = null;
		right = null;
		this.data = 0;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
