package GUI.JTable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class PrincipalFrame extends JFrame {
	private JPanel painelPrincipal;
	private JTable tabela;
	private TabelaAlunos tabelaAlunos;
	

	public PrincipalFrame() {
		super("Frame Principal");
		criarPainel();
		

	}

	public void criarPainel() {
		// Preparando o painel principal
		painelPrincipal = new JPanel();
		this.add(painelPrincipal);

		// Botão continuar
		preparaBotaoCarregar();

		// Botão Sair
		preparaBotaoSair();

		this.pack();
		
		exibirTabela();
	}

	private void exibirTabela() {
		tabela = new JTable();
		tabela.setBorder(new LineBorder(Color.black));
		tabela.setGridColor(Color.black);
		tabela.setShowGrid(true);
		tabela.setVisible(true);
		
		JScrollPane scroll = new JScrollPane(); 
		scroll.getViewport().setBorder(null);
		scroll.getViewport().add(tabela); 
		scroll.setSize(200, 200);
		
		painelPrincipal.add(scroll);
		
	}

	public void preparaBotaoSair() {
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		painelPrincipal.add(botaoSair);

	}

	public void preparaBotaoCarregar() {
		JButton botaoCarregar = new JButton("Popular tabela");
		botaoCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Aluno> alunos = new ArrayList<Aluno>();
				Aluno a1 = new Aluno("Bruno", "123", 28, 1234);
				alunos.add(a1);
				Aluno a2 = new Aluno("Pedro", "456", 21, 4321);
				alunos.add(a2);
				Aluno a3 = new Aluno("Lucas", "789", 25, 5678);
				alunos.add(a3);
				Aluno a4 = new Aluno("Ana", "741", 29, 8765);
				alunos.add(a4);
				
				tabelaAlunos = new TabelaAlunos(alunos);
				tabela.setModel(tabelaAlunos);
				
			}
		});
		painelPrincipal.add(botaoCarregar);

	}

}
