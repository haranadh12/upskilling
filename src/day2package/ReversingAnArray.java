package day2package;

public class ReversingAnArray {
	public static void main(String[] args) {
	int arr[]= {4,7,6,9};
	System.out.println("original array :");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	
	System.out.println();
	System.out.println("Reverse of an array :");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]+" ");
	}
	}
}
