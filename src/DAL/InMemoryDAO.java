package DAL;

import BLL.Model.AccountManager;
import BLL.Model.Address;
import BLL.Model.Client;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDAO extends IDAO {

    public InMemoryDAO() {
        super();
        initiateData();
    }

    public void initiateData() {
        Address address = new Address(69, "des érables", "Très-Saint-Rédempteur", "J0P1S0");
        Client client1 = new Client("Leduc", "Jacob", 5148796479L, "jacob.leduc@lepape.qc.ca", 'M', address, 120000f, 'S',  (short) 1980, (short) 6249);
        Client client2 = new Client("Leduc", "Jean", 5148796479L, "jean.leduc@lepape.qc.ca", 'M', address, 120000f, 'M',  (short) 1986, (short) 6249);
        AccountManager manager1 = new AccountManager("Beaulieu", "Marc", 5147931647L, "marc.beaulieu@gmail.com", 'M', address, (short) 512);
        manager1.clients.add(client1);
        manager1.clients.add(client2);
        this.AccountManagers.add(manager1);
    }

    @Override
    public void addClient(Client client, AccountManager accountManager) {
        accountManager.clients.add(client);
    }

    @Override
    protected Client getClientById(int id) {
        List<Client> clients = new ArrayList<>();
        this.AccountManagers.stream().forEach(x -> clients.addAll(x.clients));
        return clients.stream().filter(x -> x.Id == id).findFirst().get();
    }

    @Override
    public float getBalance(int clientId) {
        return getClientById(clientId).Accounts.stream().map(a -> a.Balance).reduce(Float::sum).get();
    }


}
