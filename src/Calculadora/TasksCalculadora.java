package Calculadora;

public class TasksCalculadora{
	 
    // atributo
    public double resultado = 0;

    // opera��o somar
    public double somar( double n1, double n2 ){

        resultado = n1 + n2;
        return resultado;
    }

    // opera��o subtrair
    public double subtrair( double n1, double n2 ){

        resultado = n1 - n2;
        return resultado;
    }        

    // opera��o multiplicar
    public double multiplicar( double n1, double n2 ){

        resultado = n1 * n2;
        return resultado;
    }

    // opera��o dividir
    public double dividir( double n1, double n2 ){

        resultado = n1 / n2;
        return resultado;
    }
  
}
