package exeption;

import exeption.banco.Banco;

public class Main {

    public static void main (String[] args){

        exeption.Banco.Banco UCBank = new Banco();

        UCBank.abrirConta("conta 1");

        try{
            UCBank.depositar("conta 1", 10.0);
        }  catch (Exception e){
            System,System.out.println("ALgo deu errado. Tente novamente.");
        }
       
    }
    
}
