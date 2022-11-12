package aplicativo;
import java.util.ArrayList;

public class Operacoes{

	public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void inserirPessoa(Pessoa pessoa){
		pessoas.add(pessoa);

	}


	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}


	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	public double calcularImc(Pessoa pessoa){

		return ((pessoa.getPeso())/ ((pessoa.getAltura()/100)*(pessoa.getAltura()/100)));



	}

	public String imcStatus(Pessoa pessoa)
	{
		double resultado = calcularImc(pessoa);
		if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f')
		{
			if(resultado < 19.1)
			{
				return "Abaixo do peso" ;
			} else if( resultado >= 19.1 && resultado <= 25.8)
			{
				return "Peso ideal";
			} else {
				return "Obeso, vai treinar!";
			}
		} else if(pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm')
		{
			if(resultado < 20.7)
			{
				return "Abaixo do peso" ;
			} else if( resultado >= 20.7 && resultado <= 26.4)
			{
				return "Peso ideal";
			} else {
				return "Obeso, vai treinar!";
			}
		} else {
			return "Pessoa com gênero inválido";
		}

	}


	public double pesoIdeal(Pessoa pessoa)
	{
		if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
			return (pessoa.getAltura() - 100) - ((pessoa.getAltura() - 150)/2);
		} else {
			return (pessoa.getAltura() - 100) - ((pessoa.getAltura() - 150)/4);
		}


	}

	public double taxaGordura(Pessoa pessoa)
	{
		double imc = calcularImc(pessoa);
		if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
			return (1.2*imc) + (0.23 * pessoa.getIdade()) - 5.4;
		} else {
			return (1.2*imc) - 10.8 + (0.23 * pessoa.getIdade()) - 5.4;
		}


	}


	public void info() {
		for(Pessoa p : pessoas) {
			System.out.println(p.toString());
		}
	}
	
	public void resultadoPessoas() {
		for(Pessoa p : pessoas) {
			System.out.print("- "+p.getNome()+" - ");
			System.out.printf("Imc: %.2f", calcularImc(p));
			System.out.print("("+imcStatus(p)+") ");
			System.out.printf("- Peso perfeito: %.2f", pesoIdeal(p));
			System.out.print(" kg ");
			System.out.printf("- Taxa de gordura: %.2f", taxaGordura(p));
			System.out.println("%");
			System.out.println("**********************************************************************");
		}
	}




}

