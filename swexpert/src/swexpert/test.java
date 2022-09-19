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
		//받아서
		T=sc.next();
		
		//데이트로 변경
		SimpleDateFormat defultFormat = new SimpleDateFormat("yyyyMMdd");
		Date formatDate = defultFormat.parse(T);
		
		//변경된 것과 기본 비교
		if(defultFormat.format(formatDate).equals(T) == false)
			System.out.println("-1");
		//다른 포맷으로 호출
		else
			System.out.println(df.format(formatDate));
		
		//0부터시작
		int[] endDateArr = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String yyyy = T.substring(0,4);
		String mm = T.substring(4,6);
		String dd = T.substring(6,8);
		
		//월 인덱스
		int idx = Integer.parseInt(mm);
		//비교할 날짜
		int comp = Integer.parseInt(dd);
		//날짜가 1보다 작거나 배열보다 크면 -1 아니면 출력
		if(comp < 1 || endDateArr[idx] < comp) System.out.println(-1);
		else System.out.println(yyyy+"/"+mm+"/"+dd);
	}
}

