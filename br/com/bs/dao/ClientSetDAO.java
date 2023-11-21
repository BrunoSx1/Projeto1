package br.com.bs.dao;

import br.com.bs.domain.Client;
import br.com.bs.dao.IClientDAO;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClientSetDAO implements IClientDAO {

    private Set<Client> set;

    public ClientSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean register(Client client) {
        return this.set.add(client);
    }

    @Override
    public void delete(Long cpf) {
        Client clientFound = null;
        for (Client client : this.set) {
            if (client.getCpf().equals(cpf)) {
                clientFound = client;
                break;
            }else System.out.println("Resgistro não existe");
        }

        if (clientFound != null) {
            this.set.remove(clientFound);
        }
    }


    @Override
    public void alter(Client client) {
        if (this.set.contains(client)) {
            for (Client clientRegistered : this.set) {
                if (clientRegistered.equals(client)) {
                    clientRegistered.setName(client.getName());
                    clientRegistered.setTel(client.getTel());
                    clientRegistered.setNumber(client.getNumber());
                    clientRegistered.setName(client.getAdsress());
                    clientRegistered.setCity(client.getCity());
                    clientRegistered.setState(client.getState());
                    break;
                }
            }
        }
    }

    @Override
    public Client consult(Long cpf) {
        for (Client clientRegistered : this.set) {
            if (clientRegistered.getCpf().equals(cpf)) {
                return clientRegistered;
            }
        }
        return null;
    }

    @Override
    public Collection<Client> searchAll() {
        return this.set;
    }

}