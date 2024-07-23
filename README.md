# RESTFUL API

#Class Diagram
mermaid

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
