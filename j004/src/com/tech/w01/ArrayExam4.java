package com.tech.w01;

public class ArrayExam4 {
	public static void main(String[] args) {
		// int[] arr = new int[5];
		// �迭���� �ٸ� ���
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("����: " + arr.length);

		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// �� �ٷ� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n===================");
		// �� �ٷ� ��� + ������ ,����
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
		
System.out.println("\n===================");
		// �� �ٷ� ��� + ������ ,����
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				System.out.print(arr[i]+", ");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
}