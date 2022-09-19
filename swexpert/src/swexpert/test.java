package swexpert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new java.util.Scanner(System.in);
		String T = "";
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		//스트링으로 받아서
		T=sc.next();
		
		//데이트형식으로 형변환
		SimpleDateFormat defultFormat = new SimpleDateFormat("yyyyMMdd");
		Date formatDate = defultFormat.parse(T);
		
		//변환 후 스트링과 입력값 비교
		if(defultFormat.format(formatDate).equals(T) == false)
			System.out.println("-1");
		//포맷에 맞춰서 형변환
		else
			System.out.println(df.format(formatDate));
		
		//인덱스는 0부터 시작이라서
		int[] endDateArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String yyyy = T.substring(0,4);
		String mm = T.substring(4,6);
		String dd = T.substring(6,8); 
		
		int idx = Integer.parseInt(mm);
		int comp = Integer.parseInt(dd);
		if(comp < 1 || endDateArr[idx] < comp) System.out.println(-1);
		else System.out.println(yyyy+"/"+mm+"/"+dd);
	}
}

