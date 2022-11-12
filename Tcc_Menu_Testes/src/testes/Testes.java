package testes;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import aplicativo.Operacoes;
import aplicativo.Pessoa;
import ui.Menu;

class Testes {
	
	Operacoes o = new Operacoes();
/*
	@Test
	public void testaCalcularImc() {
		Pessoa p = new Pessoa("Teste", "000", 180, 80, 20, 'M');
		double imc = o.calcularImc(p);
		
		Assertions.assertEquals(24,7 , imc);
	}
	
	@Test
	public void testaImcStatus() {
		Pessoa p = new Pessoa("TesteMasc", "000", 180, 80, 20, 'M');
		Pessoa p2 = new Pessoa("TesteFem", "000", 180, 60, 20, 'F');
		String resultado = o.imcStatus(p);
		String resFem = o.imcStatus(p2);
		
		Assertions.assertEquals("Peso ideal", resultado);
		Assertions.assertEquals("Abaixo do peso", resFem);
	}
	
	@Test
	public void testaPesoIdeal() {
		Pessoa p = new Pessoa("Teste", "000", 180, 80, 20, 'M');
		Pessoa p2 = new Pessoa("TesteFem", "000", 180, 80, 20, 'F');
		double resultado = o.pesoIdeal(p);
		double resFem = o.pesoIdeal(p2);
		
		Assertions.assertEquals(72,5, resultado);
		Assertions.assertEquals(65, resFem);
	}
	
	@Test
	public void testaTaxaGordura() {
		Pessoa p = new Pessoa("Teste", "000", 180, 80, 20, 'M');
		Pessoa p2 = new Pessoa("TesteFem", "000", 180, 80, 20, 'F');
		double resultado = o.taxaGordura(p);
		double resFem = o.taxaGordura(p2);
		
		Assertions.assertEquals(18,04, resultado);
		Assertions.assertEquals(21,4, resFem);
	}
	*/
	public static void main(String[] args) {
		testaMenu();
	}
	
	public static void testaMenu() {
		Menu menu = new Menu();
		
		menu.menu();
	}
	

}
