package kopo24_0422_Test;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner sc = null;
	
	InputFromConsoleClass() {
		sc = new Scanner(System.in);
	}
	
	protected void finalize() {
		sc.close();
	}
	
	public int bateundon() {
		System.out.printf("받은 원화 입력 : ");
		int bat_eun_don = sc.nextInt();
		return bat_eun_don;		
	}
	
	public int MainMenu() {
		System.out.printf("# Menu\n");
		System.out.printf("1. USD\n");
		System.out.printf("2. EUR\n");
		System.out.printf("3. JPY\n");
		System.out.printf("9. Back\n");
		System.out.printf("0. Exit\n");
		return sc.nextInt();
	}

}
