package kopo24_0422_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MakeFile {
	
	public void MakeFile(int suntekhanmenu, int bateundon, int hwanjeon_han_don, int bateulnameundon) {
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
		Date date = new Date();
		
		String contury = "";
		if (suntekhanmenu == 1) contury = "USD";
		else if (suntekhanmenu == 2) contury = "EUR";
		else if (suntekhanmenu == 3) contury = "JPY";
		
		try {
			File f = new File("C:\\Users\\Yang\\Desktop\\Result.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f, true)); // f가 잡은 파일에 append 할꺼냐? true
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String headtxt = br.readLine();
			String writetxt = sdf.format(date) + "," + contury + "," + bateundon + "," + hwanjeon_han_don + "," + bateulnameundon;
			
			if (headtxt == null) {
				headtxt = "날짜,환전대상,금액,환전결과,거스름돈";
				bw.write(headtxt);
				bw.newLine();
				bw.write(writetxt);
				bw.newLine();
			} else {
				bw.write(writetxt);
				bw.newLine();
			}
			
			bw.flush(); // 마지막으로 버퍼에 남은거 다 쓰기(버퍼 비우기)
			bw.close(); // 다른 사람도 사용할 수 있도록 파일을 닫는다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
