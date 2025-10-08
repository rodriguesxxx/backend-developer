public class SnArray {
	public static void main(String[] args) {
		System.out.println(somar(new int[]{1,2,3,4,5}, 0));
	}

	public static int somar(int[] arr, int i) {
		if(i>=arr.length) return 0;

		return arr[i] + somar(arr, i+1);
	}
}
