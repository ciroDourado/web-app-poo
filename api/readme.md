# Primeiros passos

Primeiramente, defina as suas variáveis de ambiente local, como por exemplo:
- banco de dados utilizado
- usuário
- senha

Para isso, execute o seguinte passo a passo:
- copie o conteúdo do arquivo localizado em src/main/resources/application.example.properties
- para o arquivo src/main/resources/application.properties (este não existe previamente)
- insira os dados em cada campo necessário dentro de application.properties

Caso esteja num sistema baseado em Unix, num terminal faça:__
``` cd src/main/resources/ ```__
``` cp application.example.properties application.properties ```__
``` $EDITOR application.properties ```__