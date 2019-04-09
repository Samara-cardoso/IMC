package imc;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculoImc {
	
	
	public void calcularImc() {
		
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso? "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura ? "));
		double resultado = peso /(altura*altura);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(resultado));
		String classificacao="Padrao";
		
		if(resultado<=16) {
			classificacao="Magreza grau III";
		}if(resultado>=16.1 && resultado<17){
			classificacao="Magreza grau II";
		}if(resultado>=17 && resultado<18.4){
			classificacao="Magreza Grau I";
		}if(resultado>=18.5 && resultado<25){
			classificacao="Adequado";
		}if(resultado>=25 && resultado<30){
			classificacao="Pré Obeso";
		}if (resultado> 30){
			classificacao="Obeso";
		}
		
		String mensagem = "<html>"+ "Olá  " +nome+"!"+"<br/>"+"O seu IMC é "+df.format(resultado)+ " e você encontra-se na classificação de "+classificacao+"</html>";
		
		
		 JOptionPane.showMessageDialog(null,mensagem);
		 
		 /*18.5 - 24.9	Adequado
		 25.0 - 29.9	Pré-obeso
		 30.0 - 34.9	Obesidade grau I
		 35.0 - 39.9	Obesidade grau II
		 >= 40	Obesidade grau III*/
				   
				
	}
	

}
