import java.util.*;
public class Index {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time in hh:mm:ss");
		String inputTime = input.next();
		ArrayList<String> time = getTokenizedTimeandDate(inputTime,":");
		System.out.println("Enter the date in yyyy/mm/dd");
		String inputDate = input.next();
		ArrayList<String> date = getTokenizedTimeandDate(inputDate,"/");
		DateTime entered_date = new DateTime(Integer.parseInt(time.get(0)),Integer.parseInt(time.get(1)),Integer.parseInt(time.get(2)),Integer.parseInt(date.get(0)),Integer.parseInt(date.get(1)),Integer.parseInt(date.get(2)));
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);  
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		DateTime current_date = new DateTime(hours,minutes,seconds,year,month+1,day);
		
		int result = entered_date.compareDateTime(current_date);
		if(result == 0)
			System.out.println("Entered TimeDate is same as the current TimeDate");
		else if(result < 0)
			System.out.println("The Entered Time Date is in the Past");
		else
			System.out.println("The Entered Time Date is in Future");
	}
	public static ArrayList<String> getTokenizedTimeandDate(String s1,String s2){
		int start = 0;
		ArrayList<String> time = new ArrayList<String>();
		for(int i=0;i<s1.length();){
			if(s1.charAt(i) == s2.charAt(0)){
				int j;
				for(j=0;j<s2.length();j++){
					if(i+j>=s1.length())
						break;
					if(s2.charAt(j) != s1.charAt(i+j))
						break;
				}
				if(j==s2.length()){
					String temp = "";
					for(int k=start;k<i;k++)
						temp+=s1.charAt(k);
					time.add(temp);
					i+=s2.length();
					start=i;
				}
				else{
					i++;
				}
			}
			else{
				i++;
			}
		}
		String temp = "";
		for(int i=start;i<s1.length();i++)
			temp+=s1.charAt(i);
		time.add(temp);
		return time;
	}
}
