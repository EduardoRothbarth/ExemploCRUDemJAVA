package br.com.agenda.aplicacao;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO(); 
		
		Contato contato = new Contato();
		contato.setNome("Ana Beatriz");
		contato.setIdade(30);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato); 
		// ESTA LINHA FOI COMENTADA PARA QUE NÃO FIQUE GERANDO UMA NOVA
		// PESSOA A CADA VEZ EM QUE RODARMOS O JAVA
		

		//Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Maria Gabriela dias Orlando");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(1); //É o número que está no banco de dados da PK
		
		//contatoDao.update(c1);
		// ESTA LINHA FOI COMENTADA PARA QUE NÃO FIQUE GERANDO UPDATE ENQUANTO RODADOS OUTROS METODOS
		
		
		//Deletar o contato pelo seu numero de ID
		//contatoDao.deleteByID(6);
		// ESTA LINHA FOI COMENTADA PARA QUE NÃO FIQUE GERANDO UPDATE ENQUANTO RODADOS OUTROS METODOS
		
		
		//Visualização dos registros do banco de dados TODOS
		
		for(Contato c : contatoDao.getContatos()){
			
			//FORMA A QUAL O VIDEO INSTRUÇÃO ENSINOU
			System.out.println("Contato: "+c.getNome() + ", "+c.getIdade() + "anos" +
				    ", cadastrado em: "+c.getDataCadastro());
						
			
			
			
		}
		
		
	}

}
