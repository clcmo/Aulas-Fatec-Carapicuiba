### Código da aula de 06/06/2020

- cd **asm**
- edit **p-regseg.asm**
- comentar as **linhas 5, 6, 7 e 8** (ponto e virgula)
- salvar o arquivo e sair
- asm **p-regseg.asm**
- (três vezes) **enter**
- link **p-regseg**
- **enter**
- **p-regseg.map**
- (três vezes) **enter**
- dir **p-regseg.***
- type **p-regseg.map**

Valores apontados:

|  Segmento        |Valor|
|------------------|-----|
|Codigo            |4DH  |
|Dados             |127H |
|Extra             |205H |
|Pilha             |FFFEH|

- p-regseg

|  Segmento        |Valor|
|------------------|-----|
|Codigo            |124C |
|Dados             |123C |
|Extra             |123C |
|Pilha             |1285 |

- volte ao arquivo
- descomente as linhas de códigos
- recompile o projeto

Valores apontados:

|  Segmento        |Valor|
|------------------|-----|
|Codigo            |57H  |
|Dados             |127H |
|Extra             |205H |
|Pilha             |FFFEH|

- p-regseg

|  Segmento        |Valor|
|------------------|-----|
|Codigo            |124C |
|Dados             |125A |
|Extra             |126D |
|Pilha             |128E |

Conclusão: o tamanho do segmento de código é maior.