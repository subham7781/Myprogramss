package Array;

public class Bubblesort {
	public static void main(String[] args) {
		int[] arr  = {5,4,3,2,1,6,7,9,8,10};
		int temp;
		for (int i = 0; i < arr.length-5; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) { 
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
