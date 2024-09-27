# Projeto de Exercícios de Herança e Interfaces em Java

## Descrição do Projeto

Este projeto tem como objetivo praticar os conceitos de herança, interfaces e polimorfismo na linguagem Java. O código consiste na criação de classes relacionadas a veículos e funcionários, além de interfaces que modelam operações matemáticas, formas de pagamento e autenticação de um sistema de segurança. A seguir estão detalhadas as funcionalidades implementadas.

---

### Classes de Veículos

Criação das classes:

- **Veiculo**: Classe base para os diferentes tipos de veículos.
- **Carro**, **Moto**, **Caminhão**: Classes derivadas de `Veiculo`.

Cada classe herda atributos e métodos da classe base `Veiculo` e pode ter características específicas de acordo com o tipo de veículo.

---

### Classes de Funcionários

Criação das classes:

- **Funcionario**: Classe base para os diferentes tipos de funcionários.
- **Gerente**, **Vendedor**, **Faxineiro**: Classes derivadas de `Funcionario`.

Métodos principais:

1. **baterPonto()**: Método que simula o funcionário batendo o ponto.
2. **fecharCaixa()**: Método específico para gerentes ou vendedores, responsável por fechar o caixa.
3. **realizarVenda()**: Método específico de vendedores, responsável pela venda.
4. **solicitarMaterial()**: Método usado por qualquer funcionário que precise solicitar material de trabalho.

---

### Interface OperacaoMatematica

Criação da interface `OperacaoMatematica` com os seguintes métodos:

- **somar(double a, double b)**
- **subtrair(double a, double b)**
- **multiplicar(double a, double b)**
- **dividir(double a, double b)**

A implementação é feita na classe `Calculadora`, que deve definir o comportamento desses métodos.

> Dica: Caso algum método não seja implementado, o código não irá compilar, pois a classe deve obrigatoriamente implementar todos os métodos da interface.

---

### Interface de Pagamento

Criação da interface `Pagamento` com dois métodos principais:

- **calcularPagamento()**: Método que realiza o cálculo do valor final a ser pago.
- **emitirRecibo()**: Retorna um recibo detalhado da transação.

Implementação nas classes:

- **PagamentoCartao**: Inclui uma taxa de 5% sobre o valor do pagamento.
- **PagamentoDinheiro**: Aplica um desconto de 10% sobre o valor do pagamento.

### Simulação de Pagamento
Criação de uma classe de teste que simula um pagamento de R$100,00 tanto com `PagamentoCartao` quanto com `PagamentoDinheiro`, calculando o valor final e emitindo um recibo.

---

### Interface Autenticavel

Criação da interface `Autenticavel` com os métodos:

- **login(String usuario, String senha)**: Verifica se o login e a senha estão corretos.
- **logout()**: Realiza o logout do usuário.

Implementação na classe `SistemaDeSeguranca`, que contém:

- Login e senha pré-definidos (`admin` e `1234`).
- Lógica para validar as credenciais e manter o estado do usuário autenticado.

### Simulação de Autenticação
Criação de uma classe de teste que solicita ao usuário o nome e senha. Se o login for bem-sucedido, o sistema exibe uma mensagem de boas-vindas. Caso contrário, o sistema permite que o usuário tente novamente até acertar. Também é possível realizar o logout.

---

## Como Executar

1. Clone este repositório.
2. Navegue até a pasta do projeto.
3. Compile e execute as classes de teste para verificar o funcionamento de cada módulo (Veículos, Funcionários, Operações Matemáticas, Pagamentos, e Autenticação).
4. Utilize um IDE como Eclipse ou IntelliJ para facilitar o processo de compilação e execução.

---
