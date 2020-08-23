<h1 align="center"># MeuPrimeiroBD</h1>
<h4 align="right">- Projeto já finalizado</h4>

<h2 align="center">Código Java que realiza a abertura de conexão a um banco de dados e inserção de dois dados. </h2>

<h2 align="center">Existem dois arquivos</h2>
<ul>
<li>BancoDeDados.java
   <ul>
     <li>função getConnection</li>
   </ul>
</li>
<li>CadastroNoBD.java</li>
</ul>

<h1 align="center">Instalação</h1>
<h2 align="center">software utilizado para a programação:<br><br>
<ul><li>IDE eclipse 2020/06</li>
  <li>JDK 8u261</li>
  <li>Apache tomcat 9.0.37</li>
  <li>MySQL Connector/J 8.0.21 - arquivo .jar</li>
</ul></h2>

<h3>BancoDeDados.java - função getConnection</h3>
  <p>Única nesse arquivo, intuito de abrir uma conexão ao banco de dados de nome "NOMEDOBANCO", utilizando a autenticação "UserADM" e "SENHA", em caso dealgum problema durante a conexão ocódigo throw new RuntimeException(e) é acionado e gerado erro</p>
  
  <h3>CadastroNoBD.java</h3>
  <p>Arquvo responsável por solicitar conexão usando o arquivo BancoDeDados.java.<br>Em caso do BancoDeDados.java não ocorrer problemas a mensagem de "Banco de dados conectado" será exibida, logo após guarda um comando mysql de inserir valores na tabela item do banco de dados em uma variável java seguindo depois, uma declaração dos dados "leite" e "5.0kg" para guardar no banco de dados.<br>Então é executado o comando mysql fundido com os dois dados("leite" e "5.0kg") para serem armazenados no banco, após a inserção a conexão com o banco de dados é fechada.</p>
