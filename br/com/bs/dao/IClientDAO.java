package br.com.bs.dao;

import br.com.bs.domain.Client;

import java.util.Collection;

public interface IClientDAO {
    public Boolean register(Client client);
    public void delete(Long cpf);
    public void alter(Client client);
    public Client consult(Long cpf);
    public Collection<Client> searchAll();
}
