package com.andriiiiiko.database.services;

import com.andriiiiiko.database.dao.ClientDao;
import com.andriiiiiko.database.entities.Client;

public class ClientService {

    private ClientDao clientDao = new ClientDao();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deletePerson(Client client) {
        clientDao.delete(client);
    }
}
