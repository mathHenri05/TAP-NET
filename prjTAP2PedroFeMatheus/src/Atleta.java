/**
 *
 * @author 0031432312005
 */
public class Atleta {
    private String CPF;
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String CPF, String nome) {
       this.CPF = CPF;
       this.nome = nome;
    }

    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcIMC() {
        double IMC;
        IMC =  peso / (altura * altura);
        return(IMC);
    }
                             
}
