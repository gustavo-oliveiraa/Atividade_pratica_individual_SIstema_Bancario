Simulação de Transações Bancárias - README

Este projeto consiste em uma simulação de um sistema bancário básico em Java, envolvendo clientes, lojas e funcionários. O sistema permite que clientes realizem compras em lojas e que funcionários recebam seus salários com posterior investimento de parte do valor.

Funcionamento
Clientes: Possuem contas bancárias e realizam compras em lojas, debitando o valor da compra de sua conta e creditando na conta da loja.
Lojas: Possuem contas bancárias e recebem os pagamentos das compras realizadas pelos clientes.
Funcionários: Possuem contas bancárias para salário e investimento. Recebem seus salários das lojas onde trabalham e investem 20% do valor recebido.
Banco: Gerencia as transações entre clientes e lojas, garantindo a consistência dos saldos das contas.
Classes principais
Banco: Controla a lista de lojas e as transações entre clientes e lojas.
Cliente: Representa um cliente com sua conta bancária e realiza compras em lojas.
Conta: Representa uma conta bancária com saldo e operações de depósito e saque.
Funcionario: Representa um funcionário com suas contas bancárias (salário e investimento) e recebe salário da loja onde trabalha.
Loja: Representa uma loja com sua conta bancária e recebe pagamentos dos clientes.
Main: Classe principal que inicializa o sistema, cria os objetos e executa a simulação.

Tecnologias
Java: Linguagem de programação utilizada para desenvolver o projeto.
Threads: Utilizadas para simular a concorrência entre clientes e funcionários.
Sincronização: Mecanismos de sincronização (como synchronized e wait/notify) são usados para garantir a consistência dos dados durante as operações concorrentes.

Como executar
Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
Baixe o código fonte do projeto.
Compile o código usando o comando javac *.java.
Execute a simulação usando o comando java Main.

Observações
A simulação apresenta um cenário básico de transações bancárias.
O sistema pode ser estendido para incluir funcionalidades adicionais, como transferências entre contas, empréstimos, etc.

Autor
Gustavo Maxwel de Sousa Oliveira
