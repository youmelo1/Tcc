import java.io.Serializable;
import java.text.DecimalFormat;

public class Pessoa implements Serializable 
{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
    private String codigo;
    private double altura, peso;
    private int idade;
    private char sexo;
    private double imc;
    private double gordura;
    
    DecimalFormat df = new DecimalFormat("#,###.00");
    
    public Pessoa(String nome, String codigo, double altura, double peso, int idade, char sexo) {
        this.nome = nome;
        this.codigo = codigo;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        
    }

    public String getNome(){
        return nome;
    }

    
    public double getGordura() {
        return gordura;
    }
    public void setGordura(double gordura) {
        this.gordura = gordura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        
        String gord = df.format(gordura); 
        String im = df.format(imc); 
        return "Pessoa [altura= " + altura + ", codigo=" + codigo + ", gordura= " +  gord + ", idade=" + idade
                + ", imc=" + im + ", nome=" + nome + ", peso=" + peso + ", sexo=" + sexo + "]";
    }

   

    
     
}