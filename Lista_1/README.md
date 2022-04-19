# Aula 02 – UML
1. Faça a modelagem em UML de um sistema bancário, relacionando o modelo à administração de contas
bancárias. Em um banco:
- há gerentes, cada um responsável por um grupo de clientes;
- um gerente poderá aceitar pedidos de produtos: conta bancária, empréstimo, ou cartão de crédito;
- cada cliente poderá ter acesso à sua conta bancária a qual é exclusiva para ele;
- cada conta bancária poderá oferecer serviços tais como: depositar, sacar, e transferir dinheiro entre
contas;
- o banco só pode manter dados de um cliente caso ele possua algum produto

2. Faça a modelagem em UML de um sistema de controle de cursos de informática equivalente a um
módulo de matrícula de acordo com os seguintes fatos:
- o curso pode ter mais de uma turma, no entanto, uma turma se relaciona exclusivamente com um
único curso;
- uma turma pode ter diversos alunos matriculados, no entanto uma matrícula refere-se
exclusivamente a uma determinada turma; cada turma tem um número mínimo de 10 matriculas
para iniciar o curso;
- um aluno pode realizar muitas matrículas, mas cada matrícula refere-se exclusivamente a uma
turma específica e a um único aluno

3. Faça a modelagem em UML de um sistema de reserva para uma empresa aérea.
- cada voo deverá estar cadastrado no sistema, pois as reservas serão relacionadas a eles; cada
voo pode informar o número de assentos livres, e sua tripulação (conjunto de aeroviários);
- uma reserva também possui um passageiro;
- os voos podem ser internacionais, nacionais, comerciais, ou militares;
- a um dado voo são atribuídos um código, um horário, uma data, um aeroporto de partida, e um de
destino;
- um aeroporto possui uma cidade onde se localiza, uma capacidade (número máximo) de
decolagens por hora, além de um nome;
- operadores são funcionários da empresa responsáveis pela operacionalização das reservas; eles
fazem reservas, e cancelam reservas;
- os passageiros podem pedir reservas nos voos, podem cancelar reservas, e podem pagar as
reservas.

4. Modele em UML e implemente em Java a seguinte descrição.
Um software de cálculo matemático possui diversas funcionalidades. Uma delas se refere à operação
matemática entre dois operandos (float), a qual pode ser: soma, subtração, produto, ou coeficiente.
- A operação matemática possui o método “realizar cálculo” que recebe um inteiro indicando qual
operação será realizada, e retornando o resultado da respectiva operação.
- O resultado da operação é descrito pelas seguintes informações: usuário que realizou a operação;
o tipo da operação; além da data (3 inteiros: dia, mês, e ano) da operação.
- Um usuário é descrito por seu nome, idade, e CPF.
Em sua implementação Java, no programa principal, crie alguns objetos do seu modelo, realize algumas
operações, e exiba dados dos resultados.


5. Considere o seguinte diagrama no qual há uma hierarquia de classes Personagem->SuperHeroi, e
Personagem->Vilao; e uma agregação da classe Personagem com a classe Superpoder, isto é, um
Personagem pode ter nenhum ou vários Superpderes.

![Diagrama UML - Ex5](link)

Implemente este projeto em Java acrescentando as seguintes características:
- uma propriedade (atributo) “Vida” em Personagem que registre a quantidade de energia que ele
possui – use os métodos de acesso (Get e Set);
- um método Atacar para os personagens, o qual deve receber como parâmetro a “intensidade do
ataque”, o nome do SuperPoder usado (o qual deve existir), e um objeto Personagem, o qual irá
receber o ataque; este método deverá tirar (subtrair) “intensidade do ataque” da vida do
personagem atacado com probabilidade 50% (use o método Math.random()).
No programa principal, escreva um loop onde dois personagens irão duelar até que um deles morra (vida
== 0).
