
# Sistema Escolar
Este projeto é parte da minha conclusão de curso do Vai na Web, focado no desenvolvimento de backend com Java.

## Visão Geral
O projeto consiste na construção de uma API REST para uma escola, com operações CRUD para colaboradores e alunos.

## Tecnologias Utilizadas
- Java 17
- Lombok
- Data Base H2 (para testes)
- JPA
- Flyway Migrations
- Spring Boot
- Spring Web
- Spring Security

## Funcionalidades
- Cadastrar estudante e colaborador
- Listar estudante e colaborador
- Editar estudante e colaborador
- Deletar estudante e colaborador

## Arquitetura e Abordagem
O projeto segue a arquitetura MVC (Model-View-Controller), com algumas abordagens específicas:
 - **Colaborador:** Foco no uso do padrão repository e seus métodos, implementando polimorfismo.
 - **Aluno:** Utilização intensiva do Optional com o repository, e centralização das regras de negócio na camada service, mantendo a controller mais limpa e compreensível.

## Respostas Padronizadas
As respostas do sistema seguem os padrões dos protocolos HTTP, retornando códigos de status apropriados de acordo com o resultado da requisição.

## Diagrama de Classes (UML)
(Inserir imagem do diagrama de classes aqui)
