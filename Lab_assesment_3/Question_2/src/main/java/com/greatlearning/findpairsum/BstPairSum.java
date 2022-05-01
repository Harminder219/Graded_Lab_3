package com.greatlearning.findpairsum;

import java.util.ArrayList;

public class BstPairSum {

	ArrayList<Integer> eleList = new ArrayList<>();

	private class Node {

		int val;

		Node left;

		Node right;

	}

	private Node createNode(int ele) { // for creating new node

		Node temp = new Node();

		temp.val = ele;

		return temp;

	}

	private void inplace(Node root) { // in_place order

		if (root == null) {

			return;
		}

		inplace(root.left); // traversing on left subtree

		eleList.add(root.val); // adding element to Array list

		inplace(root.right); // traversing on right subtree

	}

	public void findPairSum(int key) { // to find the pair with sum of them equal to key

		int start = 0;

		int end = eleList.size() - 1;

		for (int i = 0; i < eleList.size(); i++) {

			if (eleList.get(start) + eleList.get(end) == key) { // if pair sum is equal to key

				System.out.print("Pair is " + "(" + eleList.get(start) + "," + eleList.get(end) + ")");

				return;
			}

			else if (eleList.get(start) + eleList.get(end) < key) {

				start += 1; // increment start if pair sum is less than key

			} else {

				end -= 1; // decrement end if pair sum is greater than key

			}

		}

		System.out.print("Nodes are not found."); // in case no pair found

	}

	public BstPairSum() {

		Node newNode = createNode(40);

		newNode.left = createNode(20);

		newNode.right = createNode(60);

		newNode.left.left = createNode(10);

		newNode.left.right = createNode(30);

		newNode.right.left = createNode(50);

		newNode.right.right = createNode(70);

		inplace(newNode); // for getting access to elements in ascending order

	}

}
