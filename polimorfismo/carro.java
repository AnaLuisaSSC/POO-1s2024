package polimorfismo;

public class carro implements veiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro!");
    }
    
}