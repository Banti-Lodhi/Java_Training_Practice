package app_java_enum;

public enum SeverityEnum {
  MINOR(1, "In days"), MAJOR(2, "In days"), CRITICAL(3, "In days");
	
	private final int days;
	private final String info;
	
	private SeverityEnum(int days, String info) {
       this.days = days;
       this.info = info;
	}

	public int getDays() {
		return days;
	}
	public String getInfo() {
		return info;
	}
	
	
}