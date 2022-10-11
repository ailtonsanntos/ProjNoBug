#language:pt

Funcionalidade: Cadastrar nova conta

  Esquema do Cenário: Realizar o cadastro com <identificacao>
    Dado que a pagina de login esteja sendo exibida
    E clico em registrar
    Quando os campos de cadastro forem preenchido da seguinte forma
      | email     | <email>     |
      | nome      | <nome>      |
      | senha     | <senha>     |
      | confSenha | <confSenha> |
    E seleciono a opção "contacomsaldo"
    Entao realizo o cadastro
    Exemplos:
      | identificacao                 | email                                 | nome                          | senha  | confSenha |
      | sucesso                       | "nathan-pereira70@senioraereo.com.br" | "Nathan Benício Luiz Pereira" | "1234" | "1234"    |
      | campos obrigatórios com saldo | "felipe_damota@alfredoimoveis.com.br" | "Felipe Emanuel da Mota"      | "1234" | "1234"    |
      | campos obrigatórios sem saldo | "marcosviniciuspires@isbt.com.br"     | "Marcos Vinicius Vitor Pires" | "1234" | "1234"    |