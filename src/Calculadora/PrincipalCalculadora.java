package Calculadora;

 import javax.swing.*;


public class PrincipalCalculadora{
 
    public static void main( String args[] ){
 
        int x = 0, y= 0;
        boolean erro = false;
        
        do{       
        	erro = false;
        	
	        try {
	        	String sX;
	        	
	        	sX = JOptionPane.showInputDialog( null, "Digite o primeiro número:",
	        	        "Primeiro número", JOptionPane.QUESTION_MESSAGE );
	        	x = Integer.parseInt( sX );
	        	
	        }catch(Exception e) {
	        	erro = true;
	        	JOptionPane.showMessageDialog(null, "Digite um número válido");
	        	
	        }
	        
        } while(erro==true); 
        
        do{       
        	erro = false;
 
	        try {
	        	String sY;    
	        	sY = JOptionPane.showInputDialog( null, "Digite o segundo número:",
	        	        "Segundo número", JOptionPane.QUESTION_MESSAGE );
	            y = Integer.parseInt( sY );
	            
	        }catch(Exception e) {
	        	erro = true;
	        	JOptionPane.showMessageDialog(null, "Digite um número válido");
	        	
	        }
	        
        } while(erro==true); 
        
        
 
        // instanciação de um objeto da classe calculadora
        TasksCalculadora calc = new TasksCalculadora();
 
        JOptionPane.showMessageDialog(null, "somar: " +  calc.somar( x, y ) );
        JOptionPane.showMessageDialog(null, "subtrair: " +  calc.subtrair( x, y ) );
        JOptionPane.showMessageDialog(null, "multiplicar: " +  calc.multiplicar( x, y ) );
        if(y==0 ) {
            JOptionPane.showMessageDialog(null, "Erro... impossivel realizar divisão por 0");
        	
        }else {
            JOptionPane.showMessageDialog(null, "dividir: " +  calc.dividir( x, y ) );
        }
    
 
        System.exit( 0 );
    }
}
