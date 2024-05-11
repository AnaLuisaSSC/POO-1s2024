package polimorfismo;

public class calculadora {
    public int somar(int a, int b){
        System.out.println("somando int");
        return a + b;
    }

    public double somar(double a, double b){
        System.out.println("somando double");
        return a + b;
    }

}