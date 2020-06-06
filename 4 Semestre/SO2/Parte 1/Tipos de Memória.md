## Tipos de Memória

* **RAM**: Memória volátil, utilizada para armazenamento dos programas em execução e os dados acessíveis por esses programas. Divide-se em dois grupos: RAM dinâmica e RAM estática (**_memória cache_**).
<br/>O tamanho máximo é determinado pelo tamanho da linha de endereços, que pode ser referenciada como memória real.
* **ROM**: Memória não volátil, dedicada apenas a leitura. Também é conhecida como Firmware (Hardware programado).
<br/>Nos PCs, existem rotinas especializadas de I/O (manipuladores de interruções) e programas de partida do computador como as rotinas da Bios:
  
  |Rotinas da Bios   |     |
  |------------------|-----|
  |PRINT-SCREEN      |(05H)|
  |SERVIÇOS DE VÍDEO |(10H)|
  |LISTA DE EQUIPTOS |(11H)|
  |TAMANHO DA MEMÓRIA|(12H)|
  |ACESSO A DISCO    |(13H)|
  |PORTA SERIAL      |(14H)|
  |TECLADO           |(16H)|
  |IMPRESSORA        |(17H)|
  |BOOT STRAP        |(19H)|
  |RELÓGIO           |(1AH)|
  
  ROM BOOTSPTRAP,  POST,  SETUP 