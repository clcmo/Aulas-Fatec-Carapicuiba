## Barramento

O Barramento é formado por 4 tipos de linhas que interligam os componentes. São elas:

 * **Linhas de Tensão**: Utilizadas para a condução de energia aos componentes. 
 * **Linhas de Controle**: Utilizada para a indicação da direção da movimentação dos dados em relação à CPU, o movimento da transferência, etc.
 * **Linhas de Dados**: Utilizadas para tráfego dos dados e instruções entre a CPU - memória - controladores e/s. O tamanho (em bits) da barra de dados estabelece a quantidade de bits onde a CPU poderá ler ou gravar em um único acesso (**_tamanho da palavra_**). 
 <br/>Quando referenciamos uma máquina como “**_de 8 bits_**“, “**_de 16 bits_**”, etc.,  referenciamos o tamanho de sua barra de dados. 
 <br/>Os tamanhos mais comuns são: **8 bits**, **16 bits**, **32 bits** e **64 bits**.
 * **Linhas de Endereços**: Utilizadas para transmissão do endereço físico de memória ou endereço do dispositivo onde será feita a leitura ou gravação. 
 <br/>O tamanho (em bits) limita o tamanho máximo de memória que a CPU poderá endereçar, sendo os mais comuns:
    * 20 bits: Endereçam 1 MB
    * 24 bits: Endereçam 16 MB
    * 32 bits: Endereçam 4 GB (FFFF FFFF = 4.294.967.295)
    
 * **Memória**: É aonde estão os programas em excução e os dados necessários à execução das instruções. 
 <br/>A unidade de memória é o bit, que pode conter ou 0 ou 1 e que, agrupados de 8 em 8, formam os bytes para a representação de caracteres.
 <br/>O byte é a menor porção de mem[oria endereçável (célula). Os caracteres são formados a partir de duas tabelas: **ASCII** e **EBCDIC**. 