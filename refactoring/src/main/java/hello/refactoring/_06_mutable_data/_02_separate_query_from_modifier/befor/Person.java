package hello.refactoring._06_mutable_data._02_separate_query_from_modifier.befor;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
