package project7;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int prog, user, i;
		do {prog = (int) (Math.random() * 3);
		   } while (prog == 0);
	       prog = (int)(Math.random()*3);
		   System.out.println("�������� �������� �����");
		   i = 0;
		   user = 0;
		   do {
			   i++;
				System.out.print("������ ����� �� 1 �� 3 �������: ");
				try(Scanner input = new Scanner(System.in)){
					if (input.hasNextInt()) {
						user = input.nextInt();
						if (user == prog) {
							System.out.println("�� �������!!! ʳ������ �����:" + i);
						} else {
							if (prog < user) {
								System.out.println("�� �� �������. ��������� �� ���");
						    } else {
					    	System.out.println("�� �� �������. ��������� �� ���");
						    }
						}
					} else {
					System.out.println("�� ����� �� ���� ����� ��� ����� �����");
					} while (user != prog);
					System.out.println("�� ����� ��������!");
				}
	} while (user != prog);
		   System.out.println("�� ����� ��������!");
	}
}