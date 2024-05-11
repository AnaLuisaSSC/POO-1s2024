package polimorfismo;
import java.util.Objects;

public class cachorro extends animal{

    @Override
    public void fazerSom(){
        System.out.println("Cachorro latindo!");
    }

}