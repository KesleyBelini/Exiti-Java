## Projeto Java

Java 11

Maven

JSF 2.3.0

Primefaces 11.0.9

JPA 2.2

Postgresql 15.5

### Entregar até a 1:1 de Fevereiro (04/03-07/03)

Criar uma Agenda pessoal, em que o usuário possa salvar o contato de pessoas conhecidas.
Deve ser possível ver todos os contatos, criar um contato, alterar e excluir.

Disponibilize também todo o script usado para criar o banco de dados, tabela e entidades.

Disponibilizar um breve resumo sobre o que cada tecnologia listada acima faz.

## Explicando as Tecnologias:

### Java
Linguagem de programação baseada no paradigma de Orientação a Objetos, permitindo a representação de objetos do mundo real no ambiente computacional, preservando suas características.

### Maven
Ferramenta de gerenciamento de dependências e documentação de projetos Java.
Permite a automatização de tarefas como: 
- Compilação;
- Testes;
- Deploy;
- Empacotamento;

Faz com que todos o time de desenvolvimento use as mesmas versões de bibliotecas (Ex: shared-contracts).

### JSF
É um padrão de desenvolvimento Java EE para aplicações Web, baseada em componentes. Dá supporte para desenvolvimento de interfaces web Java.
Ele surge como uma junção de aplicações Desktop e Web, incorporando o melhor dos dois mundos:
- Componentes ricos (extensões - Ex: PrimeFaces)
- Centralização (um servidor que roda todo o sistema) baseado em requisições http;
- Facilidade de manutenção (manutenibilidade);

### Primefaces
É uma extensão(biblioteca) do JSF, com componentes sofisticados.
Oferece uma variedade de componentes prontos para serem usados, como:
- Menus
- Tabelas
- Gráficos...

### JPA (Java Persistence API)
Especificação que padroniza a forma de mapear objetos Java para banco de dados relacionais.
Transforma um objeto-relacional em um objeto Java simples(POJO), ou beans de entidade.
- A implementação do JPA mais popular é o Hibernate.


### PostgreSQL
É um sistema de gerenciamento de banco de dados relacional e open-source.
- Permite a inserção, armazenamento e  manipulação de dados, através de tabelas que se relacionam por meio de chaves estrangeiras(referencia a uma chave primária).
  
## Script do banco de dados
```sql
create database projetoJava
create table contato
(
    id       serial
        primary key,
    email    varchar(255),
    nome     varchar(255),
    telefone varchar(255)
);

alter table contato
    owner to exiti;
```

