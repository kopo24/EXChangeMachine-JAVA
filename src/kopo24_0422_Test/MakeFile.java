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
			BufferedWriter bw = new BufferedWriter(new FileWriter(f, true)); // f�� ���� ���Ͽ� append �Ҳ���? true
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String headtxt = br.readLine();
			String writetxt = sdf.format(date) + "," + contury + "," + bateundon + "," + hwanjeon_han_don + "," + bateulnameundon;
			
			if (headtxt == null) {
				headtxt = "��¥,ȯ�����,�ݾ�,ȯ�����,�Ž�����";
				bw.write(headtxt);
				bw.newLine();
				bw.write(writetxt);
				bw.newLine();
			} else {
				bw.write(writetxt);
				bw.newLine();
			}
			
			bw.flush(); // ���������� ���ۿ� ������ �� ����(���� ����)
			bw.close(); // �ٸ� ����� ����� �� �ֵ��� ������ �ݴ´�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
