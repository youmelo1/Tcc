import java.text.DecimalFormat;
import java.util.ArrayList;

public class Principal{
   
	public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
   
   DecimalFormat df = new DecimalFormat("#,###.00");
   
   Ui ui = new Ui();
   
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
        
       
      

        pessoa.setImc((pessoa.getPeso())/ ((pessoa.getAltura()/100)*(pessoa.getAltura()/100)));
 
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
                return "Obesa, vá treinar ";
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
                return "Obeso, vá treinar ";
            }
        } else {
            return "Pessoa genêro inválido";
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
            pessoa.setGordura((1.2*imc) + (0.23 * pessoa.getIdade()) - 5.4);
            return (1.2*imc) + (0.23 * pessoa.getIdade()) - 5.4;
    } else {
        pessoa.setGordura( (1.2*imc) - 10.8 + (0.23 * pessoa.getIdade()) - 5.4);
        return (1.2*imc) - 10.8 + (0.23 * pessoa.getIdade()) - 5.4;
    }

    
   }


 public void operacaoPrincipal()
   {    

       for(Pessoa p : pessoas)
       {
            calcularImc(p);
            taxaGordura(p);
            ui.imprimeInfo(p);
            
       }
   }



    
}
