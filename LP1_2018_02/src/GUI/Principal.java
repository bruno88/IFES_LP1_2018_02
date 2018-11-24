package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal {
	public static void main(String[] args) {
		
		// Exemplo de Enumerado
		MinhaCor novaCor = MinhaCor.VERDE;
		System.out.println(novaCor.getValor());
		novaCor.setValor(6);
		System.out.println(novaCor.getValor());
		novaCor = MinhaCor.ROSA;
		System.out.println(novaCor.getValor());
		//
		
		// Utilização de interfae gráfica
		final int resolucaoX = 320, resolucaoY = 200;
		
		// Criação de um Frame
		JFrame testFrame = new JFrame();
		testFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		final LinesComponent comp = new LinesComponent();
		comp.setPreferredSize(new Dimension(resolucaoX, resolucaoY));
		// adicionando o LinesComponent no nosso Frame
		testFrame.getContentPane().add(comp, BorderLayout.CENTER);
		
		// criação dos Panel
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.CYAN);
		JPanel outroPanel = new JPanel();
		outroPanel.setBackground(Color.LIGHT_GRAY);
		
		// Criação dos botões
		JButton newLineButton = new JButton("New Line");
		JButton clearButton = new JButton("Clear");
		JButton invisibleButton = new JButton("Ficar Invisivel");
		JButton outroButton = new JButton("Faz outra coisa");

		// adicionando os botões nos Panels
		buttonsPanel.add(newLineButton);
		buttonsPanel.add(clearButton);
		buttonsPanel.add(invisibleButton);
		outroPanel.add(outroButton);
		
		// adicionando os Panels no Frame
		testFrame.getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
		testFrame.getContentPane().add(outroPanel, BorderLayout.EAST);

		// Comportamento do botão newLineButton
		newLineButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x1 = (int) (Math.random() * resolucaoX);
				int y1 = (int) (Math.random() * resolucaoX);
				int x2 = (int) (Math.random() * resolucaoY);
				int y2 = (int) (Math.random() * resolucaoY);
				Color randomColor = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
				comp.addLine(x1, y1, x2, y2, randomColor);
			}
		});

		// Comportamento do botão clearButton
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comp.clearLines();
			}
		});

		// Comportamento do botão invisibleButton
		invisibleButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				testFrame.setVisible(false);
			}
		});

		// Comportamento do botão outroButton
		outroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Outra coisa aconteceu");
			}
		});

		testFrame.pack();
		testFrame.setVisible(true);

	}

}