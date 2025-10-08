
public class MaxArray {
	public static void main(String[] args) {
		int[] arr = {2,11,4,5,3,10};
		System.out.println(max(arr, arr.length));
	}

	public static int max(int[] arr, int i) {
		if(i==1) return arr[0];

		int lastMax =  max(arr, i - 1);
		
		return (lastMax > arr[i-1]) ? lastMax : arr[i-1];
	}

	
}
