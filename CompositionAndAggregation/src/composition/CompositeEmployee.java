package composition;

import aggregation.Address;

public class CompositeEmployee {
    private int id;
    private String name;
    private Address address;

    public CompositeEmployee(int id, String name, String street, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(street, city);
    }

    @Override
    public String toString() {
        return "CompositeEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private static class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }


    }
}
