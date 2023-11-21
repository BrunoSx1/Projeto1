package br.com.bs.dao;

import br.com.bs.domain.Client;
import br.com.bs.dao.IClientDAO;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMapDAO implements IClientDAO{

    private Map<Long, Client> map;

    public ClientMapDAO() {
        this.map = new HashMap<>();
    }
    @Override
    public Boolean register(Client client) {
        if(this.map.containsKey(client.getCpf())){
            return false;
        }
        this.map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public void delete(Long cpf) {
        Client clientRegistered = this.map.get(cpf);

        if (clientRegistered != null){
            this.map.remove(clientRegistered.getCpf(), clientRegistered);
        }
    }

    @Override
    public void alter(Client client) { //cliente é o que está recebendo da tela e client register é o do map, já cadastrado
        Client clientRegistered = this.map.get(client.getCpf());
        if (clientRegistered != null){
            clientRegistered.setName(client.getName());
            clientRegistered.setTel(client.getTel());
            clientRegistered.setNumber(client.getNumber());
            clientRegistered.setName(client.getAdsress());
            clientRegistered.setCity(client.getCity());
            clientRegistered.setState(client.getState());
        }
    }

    @Override
    public Client consult(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> searchAll() {
        return this.map.values();
    }
}
