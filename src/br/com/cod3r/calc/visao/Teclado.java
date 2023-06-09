package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.cod3r.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener { // O teclado escuta com Action Listener

	// Cor dos botões
	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {

		// Gerenciador de Layout
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout); // Setamos o Layout passando o GridBadLayout

		c.fill = GridBagConstraints.BOTH; // Preencher os espaços
		c.weightx = 1; // peso eixo X (horizontal)
		c.weighty = 1; // peso eixo Y (vertical)

		// BOTÕES DA LINHA 1
		c.gridwidth = 3; // preenche eixo X (horizontal) -> Botão abaixo vai ocupar espaço de 3
		adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);

		// adicionarBotao("+/-", COR_CINZA_ESCURO, c, 1, 0);
		// adicionarBotao("%", COR_CINZA_ESCURO, c, 2, 0);

		c.gridwidth = 1; // preenche eixo X (horizontal) -> Botão abaixo vai ocupar espaço de 1
		adicionarBotao("/", COR_LARANJA, c, 3, 0);

		// BOTÕES DA LINHA 2
		adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);

		// BOTÕES DA LINHA 3
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);

		// BOTÕES DA LINHA 4
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);

		// BOTÕES DA LINHA 5
		c.gridwidth = 2; // BOTÃO NÚMERO ZERO PREENCHE 2 BOTÕES
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1; // DEMAIS BOTÕES CONTINUAM COM PREENCHIMENTO DE 1
		adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);

	}

	// Método para criar os botões no GridBagLayout
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);// adicionar botão para escutar
		add(botao, c);

	}

	// Método que escuta evento de cada botão
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}

	}

}
