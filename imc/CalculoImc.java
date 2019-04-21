package imc;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculoImc {
	
	public void iniciarApp() {
		String mensagem ="Seja bem vindx à Calculara de IMC! Clique no botão abaixo para iniciar";
		JOptionPane.showMessageDialog(null, mensagem); 
		
		
	}
	
	
	public void calcularImc() {
		
		
		//Recebendo nome e validando NAO TA FUNCIONANDO
		String nome = " ";
		while(nome.contains(" ")) {
		  nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		}
		
		//Recebendo valor de peso e validando
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso? "));
		while (peso > 500 || peso < 1) {
			peso =Double.parseDouble(JOptionPane.showInputDialog("Insira um valor correto!"));
		}
		
		//Recebendo valor de altura e validando
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura ? "));
		while (altura > 2.5 || altura < 0.1) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor correto!"));
		}
		
		String classificacao="Padrao";
		DecimalFormat df = new DecimalFormat("0.00");
		double resultado = peso /(altura*altura);
		
		
		
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
