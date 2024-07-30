# RESTful API em Java 17 com Spring Boot 3xx
Esta é uma API RESTful desenvolvida em Java 17 usando Spring Boot 3xx. A API utiliza Spring Data JPA para simplificar a camada de acesso aos dados, OpenAPI (Swagger) para documentação e Railway para deploy na nuvem.

 # Tecnologias Utilizadas
- Java 17: Linguagem de programação.
- Spring Boot 3: Framework para criar aplicações Java standalone.
- Spring Data JPA: Simplifica a camada de acesso aos dados, facilitando a integração com bancos de dados SQL.
- OpenAPI (Swagger): Para documentação fácil e interativa.
- Railway: Facilita o deploy na nuvem, além de oferecer diversos bancos de dados.

# Acesse a Documentação

https://api-production-995e.up.railway.app/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

```mermaid


classDiagram
    class Felipe {
        -name: String
        +account: Account
        +features: List<Feature>
        +card: Card
        +news: List<News>
    }

    class Account {
        -accountNumber: String
        -accountAgency: String
        -accountBalance: Float
        -accountLimit: Float
    }

    class Feature {
        -icon: String
        -description: String
    }

    class Card {
        -number: String
        -limit: Float
    }

    class News {
        -icon: String
        -description: String
    }

    Felipe --> Account
    Felipe --> Feature
    Felipe --> Card
    Felipe --> News
    Felipe "1" -- "0..*" Feature : has
    Felipe "1" -- "0..*" News : has
