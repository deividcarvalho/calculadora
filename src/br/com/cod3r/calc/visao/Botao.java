package br.com.cod3r.calc.visao;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
	public Botao(String Texto, Color cor) {
		setText(Texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("courier", Font.PLAIN, 25));
		setForeground(Color.WHITE); //Cor da fonte
		setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Bordas pretas nos botões
		
	
	}

}
