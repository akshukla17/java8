package com.logic.sort;

public class MaxBinaryTree {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 34, 5, 6, 88 };
		MaxTree mt = new MaxTree();
		for (int i = 0; i < arr.length; i++) {
			mt.insertNode(arr[i]);
		}
		mt.inOrderPrint();
	}
}

class MaxTree {
	public MaxTree() {
		root = null;
	}

	Node root;
	BinaryTreeOperation bt = new BinaryTreeOperation();

	public void insertNode(int data) {
		root = insert(root, data);
	}

	private Node insert(Node node, int data) {
		Node parent;
		Node current=null;
		if (node == null) {
			node = new Node(data);
		} else {

			if (node.left == null) {
				node.left = insert(node.left, data);
				if (node.data < node.left.data) {
					maxBT(node, node.left);
				}
			} else if (node.right == null) {
				node.right = insert(node.right, data);
				maxBT(node, node.right);
			} else {
					parent=node;
					current=node.left;
					insert(current, data);
			}
		}
		return node;
	}

	public void inOrderPrint() {
		inOrderPrint(root);
	}

	public void inOrderPrint(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			inOrderPrint(node.left);
			inOrderPrint(node.right);
		}

	}

	private void maxBT(Node node, Node otherNode) {
		int temp = node.data;
		node.data = otherNode.data;
		otherNode.data = temp;
	}
}
