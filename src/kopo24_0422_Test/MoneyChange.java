package kopo24_0422_Test;

import java.util.Scanner;

public class MoneyChange {
	
	public void Calculate() {
		MoneyChange mc = new MoneyChange();
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass ifcc = new InputFromConsoleClass();
		
		Scanner sc = new Scanner(System.in);
		
		int bateundon;
		int suntekhanmenu;
		
		do {
			bateundon = ifcc.bateundon();
			suntekhanmenu = ifcc.MainMenu();
			
			if ( suntekhanmenu == ConstValueClass.MENU_USD ) { // usd
				pc.Exchange(suntekhanmenu, bateundon, ConstValueClass.HWANYULUSD);
			} else if ( suntekhanmenu == ConstValueClass.MENU_EUR ) { // eur
				pc.Exchange(suntekhanmenu, bateundon, ConstValueClass.HWANYULEUR);
			} else if ( suntekhanmenu == ConstValueClass.MENU_JPY ) { // jpy
				pc.Exchange(suntekhanmenu, bateundon, ConstValueClass.HWANYULJPY);
			} else if ( suntekhanmenu == ConstValueClass.MENU_BACK ) { // back
				mc.Calculate();
			} else if ( suntekhanmenu == ConstValueClass.MENU_EXIT ) { // exit
				System.out.printf("Thanks for using. Good Bye\n");
			} else {
				System.out.printf("Error\n");
				ifcc.MainMenu();
			}
		} while ( suntekhanmenu != ConstValueClass.MENU_EXIT );
		
	}
	
}
