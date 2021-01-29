package BLL.Service;

import BLL.Model.AccountManager;
import BLL.Model.Client;
import DAL.IDAO;

public class ManagerService {
    public IDAO dao;
    public AccountManager accountManager;

    public ManagerService(IDAO dao, AccountManager accountManager) {
        this.dao = dao;
        this.accountManager = accountManager;
    }

    public boolean AddClient(Client client) {
        if (this.accountManager.clients.size() > 5)
            return false;
        dao.addClient(client, accountManager);
        return true;
    }

    public float getBalance(int clientId) {
        return dao.getBalance(clientId);
    }


}
