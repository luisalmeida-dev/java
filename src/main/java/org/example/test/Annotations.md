# Test

- É um metodo de validar se o software produzido bate com o os requerimentos pedidos e garantir que não tenha defeitos.
- A função do teste é identificar erros, falhas ou requerimentos não cumpridos.
- Involve a execução de softwares/componentes de sistemas usando ferramentas manuais ou automaticas.
- A piramide dos testes conciste de::
    - Teste de unidade: Testa componentes ou funcionalidades isoladas.
    - Teste de integração: Testa a interação do código com componentes extersno como banco de dados, apis externas.
    - Teste end-to-end: Testa se a toda a aplicação funciona como o esperado.

## Tipos de teste:

### Teste funcional:

- Teste de unidade (**Importante!**)
- Teste de integração (**Importante!**)
- Smoke
- UAT(User Acceptance Testing) -> Teste de aceitação dos usuários
- Localization
- Globalization
- Interoperability

### Teste não funcional:

- Performance
- Resistência
- Carga
- Volume
- Escalabilidade
- Usabilidade

### Testes de manutenção:

- Regressão
- Manutenção

## Mockito:

- É uma framework que ajuda com testes unitários. Facilita a *criação de objetos simulados(mocks)*
- Ajuda no isolamento de códgio já que não precisamos de um ambiente completo de testes.

```java
// Cria um mock de uma classe que realiza operações matemáticas
Calculadora calculadora = mock(Calculadora.class);

// Configura o mock para retornar 5 quando os números 2 e 3 forem somados
when(calculadora.somar(2, 3)).

thenReturn(5);

// Chama o método a ser testado
int resultado = calculadora.somar(2, 3);

// Verifica se o resultado é o esperado
assertEquals(5,resultado);
```