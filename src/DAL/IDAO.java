package DAL;

import BLL.Model.AccountManager;
import BLL.Model.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class IDAO {
    public List<AccountManager> AccountManagers;

    public IDAO() {
        this.AccountManagers = new ArrayList<>();
    }

    public abstract void addClient(Client client, AccountManager accountManager);
    protected abstract Client getClientById(int id);
    public abstract float getBalance(int clientId);
}
