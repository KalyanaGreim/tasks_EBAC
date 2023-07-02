package org.mod24.service;

import org.mod24.dao.ClienteDao;
import org.mod24.dao.IClientDao;

public class ClienteService {

    private IClientDao clienteDao;

    public ClienteService(IClientDao clienteDao){
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
}
