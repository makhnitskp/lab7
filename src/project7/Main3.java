package project7;

public class Main3 {

	public static void main(String[] args) {
		int i = (int) Math.round(Math.random() * 101);
		System.out.println(i);
		if (i<10) {
			System.out.println("1");
		}
		else if (i>10 && i<100) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}

	}

}
