package polimorfismo;

import aula2.Calculadora;
public class main {
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        calc.somar(2, 3);
        calc.somar(2.5, 3.5);

        animal a1 = new animal();
        a1.fazerSom();

        cachorro c1 = new cachorro();
        c1.fazerSom();

        carro c2 = new carro();
        moto m1 = new moto();
        acelerarVeiculo(c2);
        acelerarVeiculo(m1);
    }

    public static void acelerarVeiculo(veiculo v){
        v.acelerar();
    }

}