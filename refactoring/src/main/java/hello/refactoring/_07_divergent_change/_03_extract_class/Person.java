package hello.refactoring._07_divergent_change._03_extract_class;

public class Person {

    private String name;

    private TelephoneNumber telephoneNumber;

	public Person(String name, TelephoneNumber telephoneNumber) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
	}

	public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }

    public String name() {
        return name;
    }

	public String getName() {
		return name;
	}
	
	public TelephoneNumber getTelephoneNumber() {
		return telephoneNumber;
	}
}
