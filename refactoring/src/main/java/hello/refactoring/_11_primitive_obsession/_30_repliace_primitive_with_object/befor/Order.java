package hello.refactoring._11_primitive_obsession._30_repliace_primitive_with_object.befor;

public class Order {

    private String priority;

    public Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
