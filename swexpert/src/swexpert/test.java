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
		//��Ʈ������ �޾Ƽ�
		T=sc.next();
		
		//����Ʈ�������� ����ȯ
		SimpleDateFormat defultFormat = new SimpleDateFormat("yyyyMMdd");
		Date formatDate = defultFormat.parse(T);
		
		//��ȯ �� ��Ʈ���� �Է°� ��
		if(defultFormat.format(formatDate).equals(T) == false)
			System.out.println("-1");
		//���˿� ���缭 ����ȯ
		else
			System.out.println(df.format(formatDate));
		
		//�ε����� 0���� �����̶�
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

