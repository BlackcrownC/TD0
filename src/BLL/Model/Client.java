package BLL.Model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    public float Salary;
    public char MaritalStatus; // S[ingle] , M[arried] , D[ivorced]
    public short BirthYear;
    public short NIP; // 4 digits
    public List<Account> Accounts;

    public Client(int id, String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address, float salary, char maritalStatus, short birthYear, short NIP) {
        super(id, lastName, firstName, phone, email, gender, address);
        Salary = salary;
        MaritalStatus = maritalStatus;
        BirthYear = birthYear;
        this.NIP = NIP;
        this.Accounts = new ArrayList<>();
    }

    public Client(String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address, float salary, char maritalStatus, short birthYear, short NIP) {
        super(lastName, firstName, phone, email, gender, address);
        Salary = salary;
        MaritalStatus = maritalStatus;
        BirthYear = birthYear;
        this.NIP = NIP;
        this.Accounts = new ArrayList<>();
    }
}
