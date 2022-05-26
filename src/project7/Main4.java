package project7;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int prog, user, i;
		do {prog = (int) (Math.random() * 3);
		   } while (prog == 0);
	       prog = (int)(Math.random()*3);
		   System.out.println("Програма загадала число");
		   i = 0;
		   user = 0;
		   do {
			   i++;
				System.out.print("Введіть число від 1 до 3 включно: ");
				try(Scanner input = new Scanner(System.in)){
					if (input.hasNextInt()) {
						user = input.nextInt();
						if (user == prog) {
							System.out.println("Ви вгадали!!! Кількість спроб:" + i);
						} else {
							if (prog < user) {
								System.out.println("Ви не вгадали. Спробуйте ще раз");
						    } else {
					    	System.out.println("Ви не вгадали. Спробуйте ще раз");
						    }
						}
					} else {
					System.out.println("Ви ввели не ціле число або ввели літеру");
					} while (user != prog);
					System.out.println("До нових зустрічей!");
				}
	} while (user != prog);
		   System.out.println("До нових зустрічей!");
	}
}