package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		organizarLayout();
		
		setVisible(true); // Aparece a tela ao iniciar a aplicação
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Ao fechar a aplicação finaliza o processo
		setLocationRelativeTo(null);//Centraliza a tela
		setSize(232,322); //Tamanho da tela
		
		/*
		Componentes do Layout
		1. Tela
		2. Display
		3. Teclado
		4. Botões do Teclado com cores e labels diferentes
		 */
		
		
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());
		//adicinar os componentes
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		new Calculadora();
	}

}
