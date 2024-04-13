package encapsulamento;

public class ContaCorrente {
    private int numero;
    private double saldo;

    private ContaCorrente(){}

    public ContaCorrente(int numeroConta){
        this.numero = numeroConta;
        this.saldo = 0;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numeroConta){
        //auditoria, pois forcei o usuario a usar esse metodo, passar pelo setNumero

        this.numero = numeroConta;
        this.saldo = 0;
    }
   
}


