
public class Calculadora {
	public static double calcular(double op1, double op2, OperadorDouble operador){
		return operador.aplicar(op1, op2);
	}
}
