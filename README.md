#Projeto DSList versão de maio

Este projeto foi desenvolvido durante o **Intensivão Java Spring**, ministrado pelo professor **Nélio Alves** da [DevSuperior](https://devsuperior.com.br/). O projeto tem como objetivo construir uma API REST para gerenciamento de uma lista de jogos, utilizando o ecossistema Spring.

## 🔧 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Banco de Dados H2 (ambiente de testes)**
- **PostgreSQL (produção/desenvolvimento)**
- **Maven**

## 📌 Funcionalidades

- ✅ Listar todos os jogos
- ✅ Visualizar detalhes de um jogo
- ✅ Listar jogos por lista
- ✅ Mover jogos dentro de uma lista
- ✅ API REST estruturada em camadas (Controller, Service, Repository, DTO)


## ⚙️ Configuração do Banco de Dados

### H2 (padrão/teste)

- **URL**: `jdbc:h2:mem:testdb`
- **Usuário**: `sa`
- **Senha**: *(vazio)*
- **Console**: [http://localhost:8080/h2-console](http://localhost:8081/h2-console) - estou usando 8081, por conta do jenkins utilizado em outros projetos.

### PostgreSQL (produção/desenvolvimento)

Configure no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/dslist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update

▶️ Como Executar
Pré-requisitos
Java 17 instalado

Maven instalado

PostgreSQL configurado (opcional)

# Clone o repositório
git clone https://github.com/clessio35/dslist-maio.git
cd dslist-maio

# Execute o projeto
./mvnw spring-boot:run



