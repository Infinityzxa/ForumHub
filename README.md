# FórumHub API

Esta é uma API REST desenvolvida com **Spring Boot 3** para gerenciamento de tópicos em um fórum. A API permite realizar operações de CRUD (criar, ler, atualizar e excluir) em tópicos, com autenticação e controle de acesso utilizando **JWT** (JSON Web Token) para segurança.

## Funcionalidades

- **Cadastro de Tópico**: Criação de novos tópicos no fórum.
- **Listagem de Tópicos**: Visualização de todos os tópicos cadastrados.
- **Detalhamento de Tópico**: Obter detalhes completos de um tópico.
- **Atualização de Tópico**: Alterar os dados de um tópico existente.
- **Exclusão de Tópico**: Remover um tópico do fórum.
- **Autenticação**: Requer autenticação via **JWT** para interagir com a API.
- **Controle de Acesso**: Somente usuários autenticados podem realizar operações CRUD.

## Requisitos

Antes de rodar a aplicação, é necessário garantir que você tenha os seguintes requisitos instalados:

- **Java 17+**
- **Maven** ou **Gradle** para gerenciamento de dependências.
- **Banco de Dados**: Utiliza um banco de dados relacional (como MySQL ou PostgreSQL) para persistência dos dados.
- 
## Dependências do Projeto

#Este projeto utiliza as seguintes dependências essenciais:

1. **Spring Boot Starter Web**  
   - Necessária para criar aplicações web, incluindo APIs RESTful.

2. **Spring Boot Starter Data JPA**  
   - Usada para integração com o banco de dados e persistência de dados com JPA.

3. **Spring Boot Starter Security**  
   - Utilizada para configurar a segurança da API e autenticação de usuários.

4. **JWT (JSON Web Token)**  
   - Usada para gerar e validar tokens JWT, garantindo uma autenticação baseada em token.

5. **Spring Boot Starter Validation**  
   - Utilizada para validação dos dados de entrada da API.

6. **Spring Boot Starter Test**  
   - Para realizar testes unitários e de integração da API.

7. **Spring Boot Starter Thymeleaf** *(Opcional)*  
   - Para implementar templates front-end diretamente na aplicação.

8. **Spring Boot Starter Actuator** *(Opcional)*  
   - Para monitoramento e métricas na aplicação.


