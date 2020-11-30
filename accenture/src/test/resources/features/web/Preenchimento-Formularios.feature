#language: pt
#Author: Adriana Toneatti
#Version: 1.0
#Encoding: UTF-8
@web
Funcionalidade: Preenchimento de formularios

  #cenário 1
  @CT01
  Cenario: Validar envio de email ao preencher os formularios
    Dado eu esteja redirecionado no formulario
    Quando eu preencher os formularios obrigatorios
    Então a mensagem "Sending e-mail success!" é apresentada
