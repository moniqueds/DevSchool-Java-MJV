programa{
    funcao inicio(){
        real saldoAtual = 10
        real valorSolicitado = 0
        real SaldoChequeEspecial = 20
        
        
        escreva("Informe o valor desejado \n")
        
        leia(valorSolicitado)
        
        se(valorSolicitado > saldoAtual){
            
            escreva("Saldo Insuficiente! Deseja usar o cheque especial? \n")
            caracter decisaoCliente = 'N'
            leia(decisaoCliente)
            se(decisaoCliente == 'S'){
                saldoChequeEspecial = saldoChequeEspecial + saldoAtual - valorSolicitado
                saldoAtual = 0
                escreva("Saque realizado com sucesso! \n")
            }
               
        }senao{
            
            saldoAtual = saldoAtual - ValorSolicitado
            escreva("Saque realizado com sucesso!" \n)
        }
            escreva("Seu novo saldo � ", saldoAtual, \n)
            escreva("Seu novo saldo do cheque especial � ", saldoChequeEspecial, \n)
        }
}        