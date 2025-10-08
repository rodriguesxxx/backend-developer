public class Fatorial {

	public static void main(String[] args) {
		System.out.println(fat(5));
	}

	public static Integer fat(Integer n) {
		if(n<=1) return 1;

		return n * fat(n-1);
	}
}
