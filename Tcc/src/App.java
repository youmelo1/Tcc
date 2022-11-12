import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
    	
    	   Principal principal = new Principal();
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
    
    


        
        
    

