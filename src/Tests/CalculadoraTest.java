package Tests;

import org.junit.Test;
import Calculadora.TasksCalculadora;

public class CalculadoraTest {
	
			
		@Test
	    public void testOne(){
	        System.out.println("Rodou");
	        
	        TasksCalculadora calc = new TasksCalculadora();
	        
	        calc.somar( 10.0, 5.0 );
	        calc.subtrair( 10.0, 5.0 );
	        calc.multiplicar( 10.0, 5.0  );
	        calc.dividir( 10.0, 5.0  );
	    }
		
		


}
