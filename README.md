# Agenda Voting
O Agenda Voting é um sistema de votação de pautas feito com base no desafio tecnico para a vaga de Junior Developer na SICREDI Coorporativa de Crédito.

## Predisposições

### Docker

O projeto conta com um docker para o banco PostgreSQL dedicado ao funcionamento do próprio App. Há um arquivo docker-compose para lidar de forma prática com os containers. Pode-se iniciar os containers com o seguinte comando (estando no diretório do arquivo):

```
docker-compose up -d
```

### Serviço da Aplicação

Para instalar as dependências do serviço, pode-se executar na raiz do repositório local o comando:

```
mvn clean install -U -DskipTests
```

Para executar o serviço via terminal, pode-se executar o arquivo ```mvnw```. É possível também executar o serviço por meio de IDE's, incluindo em modo de depuração.

### Frameworks Utilizados
```
Spring-Boot
Spring-JPA
Liquibase
MapStuct
Lombok
Docker
```
