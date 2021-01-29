package BLL.Service;

import BLL.Model.Client;
import DAL.IDAO;

public class ClientService {
    public IDAO dao;
    public Client client;

    public ClientService(IDAO dao, Client client) {
        this.dao = dao;
        this.client = client;
    }

    public float getBalance(int clientId) {
        return dao.getBalance(clientId);
    }
}
