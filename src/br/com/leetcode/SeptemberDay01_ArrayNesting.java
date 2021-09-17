package br.com.leetcode;

public class SeptemberDay01_ArrayNesting {
	
//	You are given an integer array nums of length n where nums is a permutation of the numbers in the range [0, n - 1].
//
//	You should build a set s[k] = {nums[k], nums[nums[k]], nums[nums[nums[k]]], ... } subjected to the following rule:
//
//	The first element in s[k] starts with the selection of the element nums[k] of index = k.
//	The next element in s[k] should be nums[nums[k]], and then nums[nums[nums[k]]], and so on.
//	We stop adding right before a duplicate element occurs in s[k].
//	Return the longest length of a set s[k].
//
//	Example 1:
//
//	Input: nums = [5,4,0,3,1,6,2]
//	Output: 4
//	Explanation: 
//	nums[0] = 5, nums[1] = 4, nums[2] = 0, nums[3] = 3, nums[4] = 1, nums[5] = 6, nums[6] = 2.
//	One of the longest sets s[k]:
//	s[0] = {nums[0], nums[5], nums[6], nums[2]} = {5, 6, 2, 0}
//	
//	Example 2:
//
//	Input: nums = [0,1,2]
//	Output: 1
	
	public static void main(String[] args) {
		int[] nums = new int[]{5,4,0,3,1,6,2};
		System.out.println(arraysNesting(nums));
	}

	private static int arraysNesting(int[] nums) {
		int resultado = 0;
		for (int item : nums) {
			int inicio = item;
			int contador = 0;
			contador = realizaOperacaoLogica(nums, item, inicio, contador);
			resultado = verificaMaiorResultado(resultado, contador);				
		}
		return resultado;
	}

	private static int realizaOperacaoLogica(int[] nums, int item, int inicio, int contador) {
		do {
			inicio = nums[inicio];
			contador++;	
		}
		while (inicio != item);
		return contador;
	}

	private static int verificaMaiorResultado(int resultado, int contador) {
		if (contador > resultado) {
			resultado = contador;
		}
		return resultado;
	}
}
