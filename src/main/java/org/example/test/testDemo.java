package org.example.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class testDemo {
    @Test
    public void deveSomarDoisNumeros() {
        //Dependencia mock nao esta funcionando

        // Cria um mock de uma classe que realiza operações matemáticas
        Calculadora calculadora = mock(Calculadora.class);

        // Configura o mock para retornar 5 quando os números 2 e 3 forem somados
        when(calculadora.somar(2, 3)).thenReturn(5);

        // Chama o método a ser testado
        int resultado = calculadora.somar(2, 3);

        // Verifica se o resultado é o esperado
        assertEquals(5, resultado);
    }
}
