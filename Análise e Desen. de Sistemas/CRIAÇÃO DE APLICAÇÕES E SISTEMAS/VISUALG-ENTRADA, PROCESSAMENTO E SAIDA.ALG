Algoritmo "Entrada, processamento e saida"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 9/16/2021

Var
// Seção de Declarações das variáveis
  num1 : real
  num2 : real
  num3 : real
  somaResultado : real
  media : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
  Escreval("Digite o primeiro numero: ")
  Leia(num1)
  Escreval("Digite o segundo numero: ")
  Leia(num2)
  Escreval("Digite o terceiro numero: ")
  Leia(num3)

  somaResultado <- num1 + num2 + num3
   media <- (somaResultado)/3
   Escreval("Resultado da soma total: ", somaResultado)
   Escreval("Resultado final media: ", media)

Fimalgoritmo