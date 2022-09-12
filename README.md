# workshop-spring-boot-mongodb

Passos para criação de uma API Rest em Java 11 com Spring Boot (2.x.x) utilizando o banco de dados MongoDB e implementação de operações CRUD.

**Autor:** [Franciele do Carmo Silveira](https://www.linkedin.com/in/cfrancielesilveira/)

## Downloads

* IntelliJ      ->   IDE pada desenvolvimento

* Postman       ->   Ferramenta para testar a API

* Mongo DB      ->   Banco de dados

* Mongo Compass ->   Interface gráfica do MongoDB

## Criação do projeto

* Entrar na página Spring Initializr (https://start.spring.io/)
  - Project: Maven Project
  - Language: Java
  - Spring Boot: 2.7.3
  - Packaging: Jar
  - Java: 11 (o que você tiver instalado)
  - Dependencies:
    - Lombok
    - Spring Web
    - Spring Data MongoDB
  - Generate
* Descompactar o arquivo gerado e abri-lo com o IntelliJ
* Abrir a classe [nome do projeto]Application.java e rodar o projeto
* Abrir o navegador na página: localhost:8080 clicar em enter e se estiver tudo certo aparecerá assim:

<img src="https://cdn.discordapp.com/attachments/848586232116412466/1018959567280943134/Screen_Shot_2022-09-12_at_15.58.49.png">

## Criar os sub-pacotes
  
  * config
  * domain (onde serão criadas as classes de entidades)
  * dto
  * repository (responsável por efetuar operações básicas de acesso a dados
  * resources/controller (acessa o services, busca os objetos no banco de dados)
  * services (acessa o repository

<img src="https://cdn.discordapp.com/attachments/848586232116412466/1018968967081103370/Screen_Shot_2022-09-12_at_16.38.30.png">

* Criação da classe User no pacote domain
  - Atributos básicos (private)
  - Construtores (vazio e com parâmetros, não incluir coleções no construtor com parâmetros)
  - Getters e setters
  - hashCode e equals (para que os objetos possam ser comparáveis, utilizar somente id)
  
<img src="https://cdn.discordapp.com/attachments/848586232116412466/1018970993181605959/Screen_Shot_2022-09-12_at_16.46.17.png">

* Criação da classe UserResource/UserController no pacote resource/controller
  - Para indicar que essa classe será um recurso Rest, acima do início da classe colocar a anotação @RestController
  - Para indicar qual será o caminho do endpoint, acima da classe colocar a anotação @RequestMapping("[caminho, ex: /users]")

* Criação da interface UserRepository no pacote repository
  - Para indicar que essa interface será um repository, acima do início da classe colocar a anotação @Repository
  - extends MongoRepository<[tipo da classe de dominio que será gerenciada], [tipo do id da classe]>
  
  <img src="https://cdn.discordapp.com/attachments/848586232116412466/1018977010887970856/Screen_Shot_2022-09-12_at_17.10.29.png">
  
