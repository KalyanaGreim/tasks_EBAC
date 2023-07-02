package org.mod24.service;

import org.junit.Assert;
import org.junit.Test;
import org.mod24.dao.ClienteDao;
import org.mod24.dao.mocks.ClienteDaoMock;
import org.mod24.dao.IClientDao;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClientDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoAoSalvar() {
        IClientDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

}