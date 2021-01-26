package BLL.Model;

import java.util.*;

public class AccountManager extends Person {
    public List<Client> clients;
    public short OfficeNB;

    public AccountManager(int id, String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address, short officeNB) {
        super(id, lastName, firstName, phone, email, gender, address);
        OfficeNB = officeNB;
        this.clients = new ArrayList<>();
    }

    public AccountManager(String lastName, String firstName, long phone, String email, char gender, BLL.Model.Address address, short officeNB) {
        super(lastName, firstName, phone, email, gender, address);
        OfficeNB = officeNB;
        this.clients = new ArrayList<>();
    }
}
