# Primeiros passos

Primeiramente, defina as suas variáveis de ambiente local, como por exemplo:
- banco de dados utilizado
- usuário
- senha

## Passo a passo simplificado
Para isso, execute o seguinte passo a passo:
1. copie o conteúdo do arquivo localizado em src/main/resources/application.example.properties
2. para o arquivo src/main/resources/application.properties (este não existe previamente)
3. insira os dados em cada campo necessário dentro de application.properties

## Passo a passo detalhado
Caso esteja num sistema baseado em Unix, no terminal faça: <br />
``` cd src/main/resources/ ``` <br />
``` cp application.example.properties application.properties ``` <br />
``` $EDITOR application.properties ``` <br />

## Executando
Para rodar o projeto, por fim execute: <br />
Sistema Unix: ```./mvnw clean spring-boot:run``` <br />
Windows: ```.\mvnw.cmd clean spring-boot:run``` <br />

Veja o sistema rodando abrindo num navegador, na url:
- http://localhost:8080/cursos
