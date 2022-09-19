package min;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for(int i = 1; i <= T; i++)
		{
			String date;
			date = sc.next();
            

        	if(date.substring(4,6).equals("01") || date.substring(4,6).equals("02") || date.substring(4,6).equals("03") || date.substring(4,6).equals("04") || date.substring(4,6).equals("05") || date.substring(4,6).equals("06") || date.substring(4,6).equals("07") || date.substring(4,6).equals("08") || date.substring(4,6).equals("09") || date.substring(4,6).equals("10") || date.substring(4,6).equals("11") || date.substring(4,6).equals("12")){
                if(date.substring(4,6).equals("01") || date.substring(4,6).equals("03") || date.substring(4,6).equals("05") || date.substring(4,6).equals("07") || date.substring(4,6).equals("08") || date.substring(4,6).equals("10") || date.substring(4,6).equals("12") ){
                	int days = Integer.parseInt(date.substring(6,8));
                    if(days >= 1 && days <= 31) System.out.println("#" + i + " " + date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6,8));
                    else System.out.println("#"+i+"-1");
                }else if(date.substring(4,6).equals("04") || date.substring(4,6).equals("06") || date.substring(4,6).equals("09") || date.substring(4,6).equals("11")){
                	int days = Integer.parseInt(date.substring(6,8));
                    if(days >= 1 && days <= 30) System.out.println("#" + i +  " " + date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6,8));
                    else System.out.println("#"+i+" -1");
                }else if(date.substring(4,6).equals("02")){
                	int days = Integer.parseInt(date.substring(6,8));
                    if(days >= 1 && days <= 28) System.out.println("#" + i +  " " + date.substring(0,4) + "/" + date.substring(4,6) + "/" + date.substring(6,8));
                    else System.out.println("#"+i+" -1");
                }else{
                	System.out.println("#"+i+" -1");
                } 
            }else{
            	System.out.println("#"+i+" -1");
            } 
        }
	}
}