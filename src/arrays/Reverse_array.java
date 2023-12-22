package arrays;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int sizes = sc.nextInt();
		int arr[] = new int[sizes];
		System.out.println("enter " + sizes + "elements");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array elements are: ");
		for (int i=0; i<arr.length-1; i--)
		{
			System.out.println(arr[i]);
		}

	}

}
