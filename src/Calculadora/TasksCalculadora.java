package Calculadora;

public class TasksCalculadora{
	 
    // atributo
    public double resultado = 0;

    // operação somar
    public double somar( double n1, double n2 ){

        resultado = n1 + n2;
        return resultado;
    }

    // operação subtrair
    public double subtrair( double n1, double n2 ){

        resultado = n1 - n2;
        return resultado;
    }        

    // operação multiplicar
    public double multiplicar( double n1, double n2 ){

        resultado = n1 * n2;
        return resultado;
    }

    // operação dividir
    public double dividir( double n1, double n2 ){

        resultado = n1 / n2;
        return resultado;
    }
  
}
