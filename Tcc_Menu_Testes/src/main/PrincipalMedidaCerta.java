package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import aplicativo.Operacoes;
import aplicativo.Pessoa;

public class PrincipalMedidaCerta {
	public static void main(String[] args) throws Exception {
    	
 	   Operacoes principal = new Operacoes();
 	   Pessoa pessoa = new Pessoa("Joao", "123", 180, 90, 20, 'M');
        
        try {
     	     	   
     	   FileInputStream fis = new FileInputStream("registro.txt");
     	    ObjectInputStream ois = new ObjectInputStream(fis);
     	    @SuppressWarnings("unchecked")
				ArrayList<Pessoa> pessoasSalvas = (ArrayList<Pessoa>) ois.readObject();
     	    ois.close();
     	    ois.close();
     	    principal.setPessoas(pessoasSalvas);
     	    
     	    
     	   
     
     	    
     	    
     	    
     	   
     	   
     	 

     	    
     	    
     	    
        }
        catch (FileNotFoundException e) {
     	    e.printStackTrace();
     	}
     	catch (IOException e) {
     	    e.printStackTrace();
     	}
     	catch (ClassNotFoundException e) {
     	    e.printStackTrace();
     	}
        
        //principal.operacaoPrincipal();
 	
 	
 	  
        
        
       try {

   	    FileOutputStream fos = new FileOutputStream("registro.txt");
   	    ObjectOutputStream oos = new ObjectOutputStream(fos);
   	    oos.writeObject(principal.pessoas);
   	    oos.close();
   	   
     	  
       }
       
       catch(Exception e ) {
     	  
     	  
       }
 	 	

 
 }
}
