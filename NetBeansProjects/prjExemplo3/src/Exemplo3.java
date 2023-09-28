public class Exemplo3 {

    public static void main(String[] args) {
        double numero;
        numero = Math.random() * 100;
        
        if (numero <= 50) {
            System.out.println("O número " + numero + " É menor que ou igual a 50");
        }else{
            System.out.println("O número " + numero + "É maior que 50");
        }
        
    }
    
}
