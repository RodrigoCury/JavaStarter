
public class testaRecursão {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(testaRecursão.fatorial(10));
		System.out.println(testaRecursão.fatorial(20));
	}
	
	private static long fatorial(long a) {
		if (a > 1) {
			return a * testaRecursão.fatorial(a - (long) 1);
		}
		return a;
	}

}
