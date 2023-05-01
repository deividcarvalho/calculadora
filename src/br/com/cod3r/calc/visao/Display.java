package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;
import br.com.cod3r.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label = new JLabel(Memoria.getInstancia().getTextoAtual());

	public Display() {

		Memoria.getInstancia().AdicionarObservador(this);//está interessado em ser notificado
		
		setBackground(new Color(46, 49, 50)); // definir a cor de fundo do Display
		label.setForeground(Color.WHITE); // Definir a cor branca para o label
		label.setFont(new Font("courier", Font.PLAIN, 30)); // Nome da fonte, estilo e tamanho

		// Gerenciador de Layout
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // FlowLayout com Alinhamento, Gap Horizontal e Gap
																// Vertical

		add(label); // adicionar
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor); // Sempre que houver mudança na memória, ela será notificada pelo display

	}

}
