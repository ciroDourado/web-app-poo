# Primeiros passos

Primeiramente, tenha em mãos as suas variáveis de ambiente local, como por exemplo:
- url para o banco de dados utilizado
- usuário do banco
- senha deste usuário

## Configurando

### Passo a passo simplificado
Independente do sistema que estiver usando, se atente em:
1. copiar o conteúdo do arquivo localizado em src/main/resources/application.example.properties
2. para o arquivo src/main/resources/application.properties (este não existe previamente)
3. e inserir os dados em cada campo necessário dentro de application.properties

### Detalhado
Caso esteja num sistema baseado em Unix, no terminal faça:
<br />
(não siga isso se estiver usando um Windows)
<br />
```
cd src/main/resources/
```
```
cp application.example.properties application.properties
```
```
$EDITOR application.properties
```

## Executando
Volte à pasta raiz deste projeto.
<br />
Para rodar o sistema, por fim execute:
<br />
1. Linux/Unix:
```
./mvnw clean spring-boot:run
```
2. Windows:
```
.\mvnw.cmd clean spring-boot:run
```

Veja o sistema rodando abrindo num navegador, na url:
- http://localhost:8080/cursos

## Leitura opcional:

Para seguir este tutorial, é importante ter em mãos os dados de acesso ao banco, pois a aplicação possui os meios necessários para acessá-lo automaticamente, basta que se configure uma única vez.
<br />
Porém, é necessário saber de algumas coisas:
1. o sistema de banco de dados deve estar sempre ativo (no geral está sempre ativo por padrão);
2. a aplicação não funcionará caso esteja referenciando um banco que não existe;
3. o banco necessita de um usuário para que haja o acesso;
4. assim como um banco inexistente, um usuário inexistente quebrará a aplicação;
5. bem como um usuário que não possui as permissões necessárias para o acesso.
<br />
Nisso __sempre__ se atente ao seguinte: um banco deve ser existente. Crie um caso não exista.
<br />
Geralmente no momento da criação de um banco, o sistema que gerencia pergunta a qual usuário devemos vincular aquele acesso. Por padrão ele sugere que o usuário root (que possui todos os privilégios) tenha acesso. Mas não é o recomendado, ainda mais se o root não foi configurado com uma senha.
<br />
Neste caso, crie um usuário especificamente para aquele acesso ao banco, e se certifique de checar suas permissões. São boas práticas que nunca devem ser deixadas de lado.
