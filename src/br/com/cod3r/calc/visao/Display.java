package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	private final JLabel label = new JLabel("1234,56");
	
	
	public Display() {
	setBackground(new Color(46,49,50)); // definir a cor de fundo do Display
	label.setForeground(Color.WHITE); // Definir a cor branca para o label
	label.setFont(new Font("courier", Font.PLAIN, 30)); // Nome da fonte, estilo e tamanho
	
	setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); //FlowLayout com Alinhamento, Gap Horizontal e Gap Vertical
	
	add(label); //adicionar
	}

}
