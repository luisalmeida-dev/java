# Trabalhando com *Date* e *Time*
* No java 8 Api's de Date e Time foram introduzidas para suprir a deficiencia da **java.util.Date** e **java.util.Calendar**

### Problemas com a API antiga
1. **Thread Safety:** As classes Date e Calendar nao eram thread safety. Entao os devs tinha que lidar com todos os problemas
de concorrencia, já na API nova as classes são imutáveis e Thread safe.
2. **Desing da API e facilidade de entendimento:** A API antiga tinha metodos inadequados para operações do dia a dia. A nova
é isocentrica e segue um consistente modelo de domain para data, tempo, durações e periodos.
3. **Data e tempo com fuso-horario:** Os devs tinha que escrever mais logica para tratar fuso horario, já a nova API isso
pode ser tratado utilizando *Local* e *ZonedDate/Time* API.

### Utilzando *LocalDate, LocalTime e LocalDateTime*
### LocalDate
1. Representa a data no formato **ISO (yyyy-MM-dd) sem tempo**
   1. Pode ser usado para armazenar dados como aniversários e dias de pagamento.
2. Uma instância da data atual pode ser criada a partir do relogio do sistema.
```java
LocalDate localDate = LocalDate.now();
```
3. Podemos representar uma dia, mês e ano especifico utilizando o metodo _**of**_ ou _**parse**_.
```java
LocalDate.of(2014, 02, 20);

LocalDate.parse("2015-02-20");
```
4. A classe disponibiliza varios metodos uteis para obter diversas informações.
```java
"Código pega a data atual e adiciona um dia"

LocalDate tomorrow = LocalDate.now().plusDays(1);
```
```java
"Código pega a data atual e subtrai um mês. Aceita um enum como parametro"

LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
```
```java
"Código faz um parse da data "2016-06-12" e pega o dia da semana e dia do ano"

DayofWeek sunday = LocalDate.of("2016-06-12").getDayOfWeek();

int twelve = LocalDate.of("2016-06-12").getDayOfMonth();
```

```java
"Códgio testa se a data está em ano bisexto"

boolean leapYear = LocalDate.now().isLeapYear();
```
```java
"Código teste se a data é antes ou depois de outra data"

boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-12"));

boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
```
```java
"O codigo consegue pegar os limites de uma certa data. Vai ser pego uma LocalDateTime representando o começo do dia (2016-06-12T00:00)"
"e um LocalDate que representa o começo do mês (2016-06-01)"

LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();

LocalDate firstDayOfMonth = LocalDate.Parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
```

### LocalTime
1. Representa tempo sem uma data.
2. Parecido com o *LocalDate* podemos criar uma intância do relógio do sistema ou utilizando *parse* e *of*.

```java
"Uma instância do tempo atual."
LocalTime now = LocalTime.now();
```

```java
"Utilizando uma string no metodo parse"
LocalTime sixThirty = LocalTime.parse("6:30");

"Utilizando o metodo of"
LocalTime sixThirty = LocalTime.of(6,30);
```

```java
"Adicionando uma hora ao horario total."
LocalTime sevenThirty = LocalTime.parse("6:30").plus(1, ChronoUnit.HOURS);
```

3. Há varios metodos get na API que podem ser utilizados para pegar unidades especificas de tempo como hora, minutos e segundos.
```java
int six = LocalTime.parse("6:30").getHour();
```

4. Podemos checar se um determinado tempo está antes ou depois de algum outro tempo.
```java
boolean isBefore = LocalTime.parse("6:30").isBefore(LocalTime.parse("7:30"));
```

5. Também podemos pegar o tempo maximo, minimo e meio-dia por meio de constantes na classe LocalTime.
```java
LocalTime maxTime = LocalTime.MAX;
"Retorna 23:59:59:99"
```

### LocalDateTime
1. Representa uma combinação de data e tempo. É a classe mais utilizada quando precisamos fazer a representação de ambos os dados.
2. Também pode ter uma instância criada a partir do relógio do sistema.
```java
LocalDateTime.now();
```

3. Assim como as outras classe podemos utlizar *parse* e *of* para criar instâncias de *LocalDateTime*
```java
LocalDateTime.of(2015, Month.FEBRUARY, 20 , 06, 30);

LocalDateTime.parse("2015-02-20T06:30:00");
```

4. Existem metodos para fazer adição e subtração de unidades especificas de tempo como, dias, mes e anos.
```java
LocalDateTime.plusDays(1);

LocalDateTime.minusHours(8);
```

5. Também existem os metodos get para extrair informações especificas.
```java
LocalDateTime.getMonth();
```

### ZonedDatetime API
1. Usada para quando precisamos trabalhar com fuso horário
2. Disponibiliza um *ZoneId* para cada região.

```java
"Para criar uma zona especifica"
ZoneId zoneId = ZoneId.of("Europe/Paris");
```

3. É possivel pegar uma SetList com todas as zonas disponíveis.
```java
Set<String> allZonesIds = ZoneId.getAvailableZoneIds();
```

4. *LocalDateTime* pode ser convertido para algum fuso-horário especifico
```java
ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime, zoneId);
```

5. *ZonedDateTime* tem o metodo *parse* para pegar data e tempo especifico de um fuso.
```java
ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
```

6. Outra forma de mexer com fuso é utilizando a *OffsetDateTime*, é uma representação imutavel de uma data e tempo com um offset
7. *OffsetDateTime* pode ser criado utilizando *ZoneOffset*
```java
"Primeiro criamos uma data e tempo"
LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);

"Depois adicionamos 2 horas ao tempo criado utilizando a ZoneOffset e setando para o *LocalDateTime* que criamos"
ZoneOffset offset = ZoneOffset.of("+02:00");

OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
```

### Classes *Period* e *Duration*
1. Esses representam um período de tempo em ano, mês e dias e o outro segundos e milisegundos respectivamente.

#### Period
* Essa classe é muito utilizada para alterar o valor de uma certa data ou obter a diferença entre duas datas.
```java
LocalDate initialDate = LocalDate.parse("2007-05-10");

LocalDate finalDate = initialDate.plus(Period.ofDays(5));
```

* Também disponibiliza varios getters diferentes para o objeto Period
```java
"Esse código pega a diferença entre duas datas"
int difference = Period.between(initialDate, finalDate).getDays();
```

* Também podemos pegar utilizando uma unidade especifica de tempo
```java
long difference = ChronoUnit.DAYS.between(initialDate, finalDate);
```

#### Duration
* Similar a Period, é utilizada para trabalhar com tempo.
```java
"Código cria uma data e adiciona 30 segundos ao valor inicial"
LocalTime initialTime = LocalTime.of(6, 30, 0);

LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
```

* Podemos pegar uma duração entre dois instantes como uma Duration ou unidade especifica
```java
long difference = Duration.between(intialTime, finaltime).getSeconds();

long difference = ChronoUnit.SECONDS.between(intialDate, finalDate);
```

### Formatação de Data e tempo
1. Java 8 tem APIs para facilitar a formatação
```java
"Cria uma data"
LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);

"Formata a data para o padrao ISO que vai retornar 2015-05-25"
String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
```

2. Podemos passar uma forma customizavel
```java
"Codigo retorna data formata assim: 2015/01/25"
localDateTime.format(DateTimeFormatter.ofPatter("yyyy/MM/dd"));
```