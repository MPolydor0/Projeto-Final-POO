# E-Commerce - Sistema de Autenticação e Autorização

Este projeto é um sistema de e-commerce desenvolvido em Java, com foco na implementação de autenticação e autorização utilizando Spring Security. Ele inclui uma autenticação baseada em JWT (JSON Web Token) e um sistema de gerenciamento de usuários com roles que determinam os níveis de acesso.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para interação com o banco de dados usando JPA (Java Persistence API).
- **MySQL**: Banco de dados para desenvolvimento.
- **Segurança**: Spring Security, JWT
- **Maven**: Gerenciador de dependências e construção de projetos.

## Funcionalidades

- **Autenticação via JWT**: Login com geração de token JWT. Validação de token para acesso às rotas protegidas.
- **Sistema de Autorização**: Gerenciamento de usuários com diferentes roles (ADMIN, USER, etc.). Controle de acesso com base nos papéis atribuídos.
- **APIs de Usuários:**: Registro de novos usuários. Consulta, atualização e exclusão de usuários (restrito ao ADMIN).
- **Segurança**: Proteção de endpoints sensíveis. Configuração de políticas de CORS.

### `ProjecAuten/src/test/java/proj/Maromo/ProjecAuten/ProjecAutenApplicationTests.java`
- `ProjecAutenApplicationTests.java`: Classe de teste para verificar se a aplicação carrega corretamente.

## Como Executar

### Pré-requisitos
- Java JDK 11+
- MySQL instalado e configurado
- Maven
- IDE como IntelliJ IDEA, Eclipse ou VScode

## Instruções de Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/fRen4505/Projeto-Final-POO.git
   cd Projeto-Final-POO

-   Compile e execute a aplicação:
    Copiar código:
   ```bash       
    mvn spring-boot:run
```

-   Acesse a aplicação no navegador em: [http://localhost:8080/jogadores-view](http://localhost:8080).
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.


## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo `LICENSE` para mais detalhes.
