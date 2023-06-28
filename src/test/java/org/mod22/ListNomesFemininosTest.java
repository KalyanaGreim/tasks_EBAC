package org.mod22;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Exercicio modulo 23 - TESTES JUNIT
public class ListNomesFemininosTest {
    @Test
    public void testNomesFemininos() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 'M'));
        pessoas.add(new Pessoa("Maria", 'F'));
        pessoas.add(new Pessoa("Ana", 'F'));
        pessoas.add(new Pessoa("Pedro", 'M'));

        List<String> nomesFemininos = pessoas.stream()
                .filter(pessoa -> pessoa.getSexo() == 'F')
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        List<String> expectedNomesFemininos = new ArrayList<>();
        expectedNomesFemininos.add("Maria");
        expectedNomesFemininos.add("Ana");

        Assert.assertEquals(expectedNomesFemininos, nomesFemininos);
    }

}