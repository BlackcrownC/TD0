package BLL.Model;

public abstract class Person {
    public int Id;
    public String LastName;
    public String FirstName;
    public long Phone;
    public String Email;
    public char Gender; // M[ale] , F[emale] , O[ther]
    public Address Address;

    public Person(int id, String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address) {
        Id = id;
        LastName = lastName;
        FirstName = firstName;
        Phone = phone;
        Email = email;
        Gender = gender;
        Address = address;
    }

    public Person(String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address) {
        Id = getNewId();
        LastName = lastName;
        FirstName = firstName;
        Phone = phone;
        Email = email;
        Gender = gender;
        Address = address;
    }

    private static int number = 0;
    public static int getNewId() {
        return ++number;
    }
}
