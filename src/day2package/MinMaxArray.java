package day2package;

public class MinMaxArray {
	
	public int max(int array[]) {
		int max = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
		
	}
	public int min(int array[]) {
		int min =array[0];
		for(int i =0;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String[]args) {
		int arr[] = {2,4,5,6,7};
		MinMaxArray minmaxarray = new MinMaxArray();
		System.out.println("Maximum value "+minmaxarray.max(arr));
		System.out.println("Minimum Value " +minmaxarray.min(arr));
	}
}
