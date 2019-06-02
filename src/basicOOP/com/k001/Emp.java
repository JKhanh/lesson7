package basicOOP.com.k001;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void Display(){
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Hanoi", "HN", "Vietnam");
        Address address2 = new Address("Ho Chi Minh", "HCM", "Vietnam");

        Emp e = new Emp(111, "Hoang", address1);
        Emp e2 = new Emp(112, "Long", address2);
        e.Display();
        e2.Display();
    }
}
