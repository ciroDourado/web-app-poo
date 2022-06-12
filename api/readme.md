# Primeiros passos

Primeiramente, defina as suas variáveis de ambiente local, como por exemplo:
- banco de dados utilizado
- usuário do banco
- senha deste usuário

Isso é importante pois a aplicação irá usar estes dados para se conectar ao banco de dados presente na sua máquina local. <br />
Se você já possui um sistema gerenciador de banco de dados instalado, apenas se preocupe em criar um banco para este sistema. <br />
No geral, alguns desses gerenciadores já perguntam a qual usuário este banco deve ser vinculado - mas se não for seu caso, crie também um usuário com senha, e dê a ele privilégios (todos) para usar este banco. <br />

Com tudo isso, estamos prontos para configurar diretamente o projeto.

## Passo a passo simplificado
Para isso, se atente ao seguinte passo a passo:
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
