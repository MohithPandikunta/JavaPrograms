package arrays;

import java.util.Scanner;

public class Input_from_user {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int sizes = scanner.nextInt();
		int arr[] = new int[sizes];
		System.out.println("enter "+ sizes + "elements");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("array elements are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
