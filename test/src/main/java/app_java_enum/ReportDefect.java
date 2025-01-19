package app_java_enum;

public class ReportDefect {

	public static void main(String[] args) {
//	      SeverityEnum s = SeverityEnum.MINOR;
//	      int days = s.getDays();
//	      String info = s.getInfo();
//	      
//	      System.out.println("Total number of days and infomation to fix: "+ days +", "+info);
		
		
		for(SeverityEnum s: SeverityEnum.values()) {
			System.out.println(s.ordinal());
			System.out.println(s.name());
		}
	}

}
