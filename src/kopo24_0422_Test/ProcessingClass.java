package kopo24_0422_Test;

public class ProcessingClass {
	
	public void Exchange(int suntekhanmenu, int bateundon, double hwanyul) {
		MakeFile mf = new MakeFile();
		
		int hwanjeon_han_don = (int)(bateundon/hwanyul); // 환전한 받을 외화
		double nameundon = bateundon / hwanyul - hwanjeon_han_don; // 환전하고 남은 외화(소수점)
		int bateulnameundon = ((int)( (nameundon * hwanyul + 5) / 10)) * 10; // 남은 외화 다시 원으로 환전
		
		OehwaGetsu(suntekhanmenu, hwanjeon_han_don);
		HangukdonGetsu(bateulnameundon);
		mf.MakeFile(suntekhanmenu, bateundon, hwanjeon_han_don, bateulnameundon);
	}
	
	// KOR
	public void HangukdonGetsu(int bateulnameundon) {
		int remain50000 = bateulnameundon/50000;
		int remain10000 = bateulnameundon%50000/10000;
		int remain5000 = bateulnameundon%50000%10000%5000;
		int remain1000 = bateulnameundon%50000%10000%5000/1000;
		int remain500 = bateulnameundon%50000%10000%5000%1000/500;
		int remain100 = bateulnameundon%50000%10000%5000%1000%500/100;
		int remain50 = bateulnameundon%50000%10000%5000%1000%500%100/50;
		int remain10 = bateulnameundon%50000%10000%5000%1000%500%100%50/10;
		
		OutputClass cp = new OutputClass();
		cp.HangukdonGetsuPrint(bateulnameundon, remain50000, remain10000, remain5000, remain1000, remain500, remain100, remain50, remain10);
	}
	
	// USD, EUR, JPY
	public void OehwaGetsu(int suntekhanmenu, int hwanjeon_han_don) {
		OutputClass cp = new OutputClass();
		
		if ( suntekhanmenu == 1 ) { // USD
			int remain100 = hwanjeon_han_don/100;
			int remain50 = hwanjeon_han_don%100/50;
			int remain20 = hwanjeon_han_don%100%50/20;
			int remain10 = hwanjeon_han_don%100%50%20/10;
			int remain5 = hwanjeon_han_don%100%50%20%10/5;
			int remain2 = hwanjeon_han_don%100%50%20%10%5/2;
			int remain1 = hwanjeon_han_don%100%50%20%10%5%2/1;
			
			cp.UsdGetsuPrint(hwanjeon_han_don, remain100, remain50, remain20, remain10, remain5, remain2, remain1);
		} else if ( suntekhanmenu == 2 ) { // EUR
			int remain500 = hwanjeon_han_don/500;
			int remain200 = hwanjeon_han_don%500/200;
			int remain100 = hwanjeon_han_don%500%200/100;
			int remain50 = hwanjeon_han_don%500%200%100/50;
			int remain20 = hwanjeon_han_don%500%200%100%50/20;
			int remain10 = hwanjeon_han_don%500%200%100%50%20/10;
			int remain5 = hwanjeon_han_don%500%200%100%50%20%10/5;
			int remain2 = hwanjeon_han_don%500%200%100%50%20%10%5/2;
			int remain1 = hwanjeon_han_don%500%200%100%50%20%10%5%2/1;
			
			cp.EurGetsuPrint(hwanjeon_han_don, remain500, remain200, remain100, remain50, remain20, remain10, remain5, remain2, remain1);
		} else { // JPY
			int remain10000 = hwanjeon_han_don/10000;
			int remain5000 = hwanjeon_han_don%10000/5000;
			int remain2000 = hwanjeon_han_don%10000%5000/2000;
			int remain1000 = hwanjeon_han_don%10000%5000%2000/1000;
			int remain500 = hwanjeon_han_don%10000%5000%2000%1000/500;
			int remain100 = hwanjeon_han_don%10000%5000%2000%1000%500/100;
			int remain50 = hwanjeon_han_don%10000%5000%2000%1000%500%100/50;
			int remain10 = hwanjeon_han_don%10000%5000%2000%1000%500%100%50/10;
			int remain5 = hwanjeon_han_don%10000%5000%2000%1000%500%100%50%10/5;
			int remain1 = hwanjeon_han_don%10000%5000%2000%1000%500%100%50%10%5/1;
			
			cp.JpyGetsuPrint(hwanjeon_han_don, remain10000, remain5000, remain2000, remain1000, remain500, remain100, remain50, remain10, remain5,remain1);
		}

	}

}
