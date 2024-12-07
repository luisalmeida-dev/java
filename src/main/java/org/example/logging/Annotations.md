# Logs

- Utilizado para entender e debuggar os comportamentos em runtime da aplicação.
- Um log prove uma rastro de informações completas referente a aplicação e também grava falhas criticas caso acontecam.
- É formado por tres componentes: *Logger*, *manipuladores de log* ou *Appenders* e *Layouts* ou *formatadores de log*.

## Niveis de log:

**[INFO]**: Nivel de negócio, monitora *coisas importantes para o negócio*, como um login bem sucedido ou transacoes de
uma compra

**[WARN]**: É a *primera camada de avisos, algo não está certo porém nada vital*, uma transação demorando muito por
exemplo.

**[ERROR]**: Problemas reais, como um pagamento falho ou problema no servidor

**[FATAL]**: Aqui tudo deu errado, um pedaço ou toda a aplicação parou de funcionar

## Estrutura de logs:

- Cada informação de um log tem seu campo e valor, assim sendo bom utilizar uma estrutura para facilitar o tratamento
  dos logs dentro de uma aplicação
- Geralmente são tranformados em json, as frameworks mais comuns já fazer isso.