package BLL.Model;

public class Address {
    public int CivicNB;
    public String Street;
    public String City;
    public String PostalCode;

    public Address(int civicNB, String street, String city, String postalCode) {
        CivicNB = civicNB;
        Street = street;
        City = city;
        PostalCode = postalCode;
    }
}
