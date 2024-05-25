package exeption.Banco;

import java.util.ArrayList;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }
    public void abrirConta(String nomeConta){
        ContaCorrente conta = new ContaCorrente(nomeConta);
        this.contas.add(conta);
    }

    public void depositar(String momeConta, Double valorDeposito){

        if (valorDeposito <= 0);

        for (ContaCorrente conta : contas){
            if(conta.getNomeConta().equals(nomeConta)){
                contaDeposito = conta;
                conta.setSaldo(conta.getSaldo() + valorDeposito);
            }
        }
    }
}
