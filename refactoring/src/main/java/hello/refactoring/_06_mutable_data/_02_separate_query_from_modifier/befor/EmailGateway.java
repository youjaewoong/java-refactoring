package hello.refactoring._06_mutable_data._02_separate_query_from_modifier.befor;

public class EmailGateway {
    public void send(String bill) {
        System.out.println(bill);
    }
}
