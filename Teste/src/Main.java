import javax.swing.JButton;
import javax.swing.JFrame;


public class Main extends JFrame{
	JButton btTeste;
	
	public Main(){
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes(){
		btTeste = new JButton("Testanto Lambda outra vez");
		
		//
		getContentPane().add(btTeste);
		
		//
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void definirEventos(){
		btTeste.addActionListener((event) -> {
			double resultado = Calculadora.calcular(2d, 2d, (a,b) -> a + b);
			System.out.println(resultado);
		});
	}
	
	public static void main(String[] args) {				
		new Main();	
	}
}
