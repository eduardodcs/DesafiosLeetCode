package br.com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SeptemberDay02_UniqueBinarySearchTree {

	public static void main(String[] args) {
	
		List<TreeNode> resposta = new ArrayList<>();
		resposta = generateTrees(3);
		System.out.println(resposta);

	
	}
	
	public static List<TreeNode> generateTrees(int n) {
		return constructtree(1, n);

	}

	public static List<TreeNode> constructtree(int start, int end) {
		ArrayList<TreeNode> al = new ArrayList<>();
		// base case if start > end then subtree will be empty so returning NULL in the
		// list
		if (start > end) {
			al.add(null);
			return al;
		}
		for (int i = start; i <= end; i++) {
			// Constructing left and right subtree

			List<TreeNode> leftsubtree = constructtree(start, i - 1);
			List<TreeNode> rightsubtree = constructtree(i + 1, end);

			// iterate over left and right subtree
			for (int j = 0; j < leftsubtree.size(); j++) {
				for (int k = 0; k < rightsubtree.size(); k++) {
					TreeNode left = leftsubtree.get(j);
					TreeNode right = rightsubtree.get(k);
					TreeNode root = new TreeNode(i); // Making ith as root
					root.left = left; // connecting leftsubtree to left of root
					root.right = right; // connecting rightsubtree to right of root
					al.add(root);
				}

			}

		}
		return al;
	}
}
