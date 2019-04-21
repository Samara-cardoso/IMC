package imc;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;

class panel0 extends JPanel implements ActionListener {
JButton but0;
JTextField Button;

public panel0() {
super();
setBorder(BorderFactory.createTitledBorder(""));

GridBagLayout gbpanel0 = new GridBagLayout();
GridBagConstraints gbcpanel0 = new GridBagConstraints();
setLayout(gbpanel0);

but0 = new JButton("IMC");
but0.addActionListener(this);
gbcpanel0.gridx = 0;
gbcpanel0.gridy = 1;
gbcpanel0.gridwidth = 1;
gbcpanel0.gridheight = 1;
gbcpanel0.fill = GridBagConstraints.BOTH;
gbcpanel0.weightx = 1;
gbcpanel0.weighty = 0;
gbcpanel0.anchor = GridBagConstraints.NORTH;
gbpanel0.setConstraints(but0, gbcpanel0);
add(but0);

Button = new JTextField();
gbcpanel0.gridx = 0;
gbcpanel0.gridy = 0;
gbcpanel0.gridwidth = 2;
gbcpanel0.gridheight = 1;
gbcpanel0.fill = GridBagConstraints.BOTH;
gbcpanel0.weightx = 1;
gbcpanel0.weighty = 0;
gbcpanel0.anchor = GridBagConstraints.NORTH;
gbpanel0.setConstraints(Button, gbcpanel0);
add(Button);
} 

public void actionPerformed(ActionEvent e) {
	
if (e.getSource() == but0) {
	CalculoImc calculo1 = new CalculoImc();
	calculo1.iniciarApp();
	calculo1.calcularImc();
	
// Action for but0
}
} 
} 

