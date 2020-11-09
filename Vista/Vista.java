package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista extends JFrame{

	//Componentes
	JPanel Panel;
	JLabel Hola;
	
	public Vista() {
		
		ventana();
		Panel();
		Texto();
	}
	
	public void ventana() {
		
		setVisible(true);
		setBounds(0,0, 1080, 680);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		setTitle("Pratica");
	}
	
	public void Panel() {
		Panel = new JPanel();
		Panel.setBounds(0,0, 1080,680);
		Panel.setBackground(new Color(225, 175,175));
		
		add(Panel);
	}
	
	public void Texto() {
		
		Hola = new JLabel();
		Hola.setText("Holap, esto es lo único que sé me ocurrió hacer tbh");
		Hola.setBounds(150,150, 40,40);
		
		Panel.add(Hola);
	}
}
