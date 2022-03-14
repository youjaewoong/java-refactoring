package hello.refactoring._07_divergent_change._03_extract_class;

public class TelephoneNumber {
	
	private String areaCode;
	private String number;
	public TelephoneNumber(String areaCode, String number) {
		super();
		this.areaCode = areaCode;
		this.number = number;
	}
	
	public String getAreaCode() {
		return areaCode;
	}
	
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return this.areaCode + " " +  this.number;
	}
}