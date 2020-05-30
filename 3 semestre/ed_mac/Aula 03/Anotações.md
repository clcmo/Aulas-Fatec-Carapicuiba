## Conceitos de Orientação a Objetos

Vamos separar o desenvolvimento de aplicações que, antes, desenvolvíamos através do método main. Isso se chama modularização, que permite em separar cada funcionalidade para depois poder construir o código.


| <img src="https://github.com/clcmoliveira/Aulas-ED/blob/master/Estruturas.png?raw=true"> 	| <img src="https://github.com/clcmoliveira/Aulas-ED/blob/master/modeloOO.png?raw=true"> 	|
|------------------------------------------------------------------------------------------	|----------------------------------------------------------------------------------------	|


---
Exemplo de Banco de Dados e Classes
---

Exemplo de um Banco de Dados

| id 	| nome 	| ano  	| 
|----	|------	|------	|
| 1  	| Ana  	| 2000 	|
| 2  	| Bia  	| 1999 	|

Toda classe possui atributos e métodos, conforme o seguinte exemplo:

| Classe           	| 
|------------------	|
| - Att1<br>- Att2 	| 
| - Met1<br>- Met2 	| 


----
Boas Práticas
----

- Veja os arquivos da [Aula 01](https://github.com/clcmoliveira/Aulas-ED/tree/master/Aula%2001), pois elas possuem algumas explicações a respeito de atributos e métodos.

- Em uma **classe modelo** Java, sempre é bom lembrar:
 - Quais os **Atributos**,
 - A classe terá **Construtores**?
 - Os métodos **Get e Set** de cada atributo,
 - O método **toString()** para possível exibição na tela, e
 - Quais os **demais métodos** a inserir

----
Métodos Get e Set
----

São métodos as quais consultamos (**Get**) e modificamos (**Set**) os valores que atribuimos aos atributos da classe. Desta forma, não precisamos transformar nossos atributos da classe, diretamente, em públicos, uma vez que estamos as encapsulando.

[Exemplo - DevMedia](https://www.devmedia.com.br/get-e-set-metodos-acessores-em-java/29241)
