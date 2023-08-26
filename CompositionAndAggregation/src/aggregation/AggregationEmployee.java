package aggregation;

public class AggregationEmployee {
    private int id;
    private String name;
    private Address address;

    public AggregationEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AggregationEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
