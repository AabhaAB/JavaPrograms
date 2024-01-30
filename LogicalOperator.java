package Operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// AND, OR and NOT
		int a = 10;
		int c = 30;
		System.out.println(a<10 && a<c);
		System.out.println(a<10|| a<c);
		System.out.println (!(a<20 & a<c));
	}

}
