## Elementos Computacionais 

Obs. Ver apostila

Os elementos computacionais são:
- Elementos de Hardware
- Elementos de Software
- Elementos de Peopleware (utilização dos usuários)
- **Elementos de Middleware (intermediários)=> ex. um arquivo do Excel é formatado para SQL (o tradutor é o MW)**
- Elementos de Firmware

Os **Elementos de MW** fazem parte da camada OSI.
----

| App              |    |
|------------------|----|
| Apresentação     | MW |
| Sessão (Conexão) | MW |
| Transporte (TCP) |    |
| Rede (IP)        |    |
| Enlace           |    |
| Fisica           |    |

---------------

### CPU
Sigla de Unidade Central de Processamento, possui a responsabilidade da execução das instruções dos programas armazenados na memória principal. Cada CPU reconhece um determinado conjunto de instruções. onde cada instrução corresponde a um circuito na CPU.

As CPUs trabalham em dois estados distintos:
- **Estado Problema: são executadas as instruções dadas pelo usuário ao programa**
- Estado Supervisor: são executadas todas as instruções

------
- Tudo que se passa na CPU é em hexadecimal
- Todo transporte ocorre em binário
------

Os componentes da CPU são:
- **U**nidade de **L**ógica e **A**ritimética: possui circuitos específicos para a execuçaõ das instruções da máquina
- **U**nidade de **C**ontrole: busca as instruções na memória, por ordem de execução especificada pelo programador e pela decodificação das mesmas.
- Relógio: gera pulsos eletrônicos que impulsionam e sincronizam as atividades dos elementos ativos da CPU. O relógio também controla o ritmo de trabalho, cuja frequencia determina a duração do ciclo de máquina, que corresponde ao inverso da frequência do clock
----------
Se o ciclo de máquina de um processador cuja frequencia é de 500MHz é igual a 1/500.00.00 ou 2 nanossegundos, o ciclo de máquina de um processador cuja frequencia é de 200MHz é igual a 1/200.00.00 ou 5 nanossegundos.
----------
- Registradores: são pequenas porções de RAM de alta velocidade, utilizado para conter operandos, para comunicação entre os aplicativos e o S.O. e, principalmente, para conter valores que representam os endereços lógicos da memória.
  - **Endereços lógicos** são derivados de **endereços físicos** e são formados por um E.F. associado a um deslocamento os quais são determinados em momentos distintos. A quantidade, tamanho e a nomenclatura dos registradores são específicos a determinada familia de processadores.
  - Formato de uma instrução:
  
  | Cod. Operação | Operandos |
  |---------------|-----------|
  
  O código da operação identifica a ação a ser realizada pela CPU (Soma, Subtração, etc.). Os operandos, cuja quantidade tipicamente é 1 , ou 3 são os elementos que sofrerão a ação executada pela CPU. 
  Estes opreandos podem ser classificados em: **imediatos**, **memória** e **registrador**, cujas instruções são classificadas em:
    
    | Instruções                | O que é?                                       | Exemplo              |
    |---------------------------|------------------------------------------------|----------------------|
    | memória / memória         | os dois operandos estão em memória (restrito)  | mov x, y             |
    | memória / registrador     | um operando em memória e outro em registrador  | add r1, y; add y, r1 |
    | memória / imediato        | um operando em memória e outro em imediato     | add y, 5             |
    | registrador / registardor | onde ambos operam em registradores             | add r1, r2           |
    | registardor / imediato    | um operando em registrador e outro em imediato | add r1, 4            |
    
    - Passos de um ciclo de execução de uma instrução:
      - Busca de instrução na memória
      - Decodificação
      - Calculo do endereço da próxima instrução
      - Endereçamento dos operandos
      - Ativação
      - Verificação
      - Armazenamento dos resultados
