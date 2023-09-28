public class Exemplo5 {

    public static void main(String[] args) {
        double numero, resultado;
        int cont;
        
        numero = Math.random() *100;
        
        cont = 1;
        while(cont <= 10) {
            resultado = numero * cont;
            
            System.out.println(numero + " x " + cont + " = " + resultado);
            cont++;
        }
    }
}
