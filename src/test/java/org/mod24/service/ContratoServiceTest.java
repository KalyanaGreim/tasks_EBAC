package org.mod24.service;

import org.junit.Assert;
import org.junit.Test;
import org.mod24.dao.ContratoDao;
import org.mod24.dao.IContratoDao;
import org.mod24.dao.mocks.ContratoDaoMock;

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroSalvarComBancoDeDados(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroBuscar() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.buscar();

    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Excluido com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroExcluir() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.excluir();
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Atualizado com sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAtualizar() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.atualizar(); // Chama o método atualizar(), espera-se uma exceção
    }
}
