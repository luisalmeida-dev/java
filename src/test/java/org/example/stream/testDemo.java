package org.example.stream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testDemo {
    /*
    - Metodo @Before executa um metodo toda vez antes de fazer um teste.
    - Ja o metodo @After executa toda vez depois de um teste.
    - @BeforClass executa o metodo apenas uma vez para toda a classe.
     */

    @Test
    public void deveSomarDoisNumeros() {

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
