package hello.refactoring._06_mutable_data._03_remove_setting_method;

public class Person {

	public Person(int id) {
		this.id = id;
	}
	
    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
