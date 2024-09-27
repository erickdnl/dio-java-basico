package main;

import java.time.LocalDate;
import java.time.Month;

import lista.CatalogoLivros;
import lista.ListaTarefa;
import lista.OrdenacaoPessoa;
import map.AgendaEventos;
import map.EstoqueProdutos;
import set.AgendaContatos;
import set.CadastroProdutos;
import set.ConjuntoConvidados;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OPERACOES BASICAS LIST
		System.out.println("---------- LIST ----------");
		System.out.println();
		System.out.println("OPERACOES BASICAS LIST");
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

		listaTarefa.removertarefa("Tarefa 2");
		
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefas());

		listaTarefa.obterDescricoesTarefas();
		
		System.out.println();
		
		//PESQUISA LIST
		System.out.println("PESQUISA LIST");
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
		
		System.out.println();
		
		//ORDENACAO LIST
		System.out.println("ORDENACAO LIST");
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
		System.out.println();
		
		//OPERACOES BASICAS SET
		System.out.println("---------- SET ----------");
		System.out.println();
		System.out.println("OPERACOES BASICAS SET");
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println();
		
		//PESQUISA SET
		System.out.println("PESQUISA SET");
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Erick", 123456);
		agendaContatos.adicionarContato("Erick", 5665);
		agendaContatos.adicionarContato("Erick Daniel", 1111111);
		agendaContatos.adicionarContato("Erick DCO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 1111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Erick"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
		
		System.out.println();
		
		//ORDENACAO SET
		System.out.println("ORDENACAO SET");
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
		cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
		cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
		cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		cadastroProdutos.exibirProdutos();
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
		System.out.println();
		
		
		//OPERACOES BASICAS MAP
		System.out.println("---------- MAP ----------");
		System.out.println();
		System.out.println("OPERACOES BASICAS MAP");
		map.AgendaContatos agendaContatosMap = new map.AgendaContatos();
		
		agendaContatosMap.adicionarContato("Erick", 123456);
		agendaContatosMap.adicionarContato("Erick", 5665);
		agendaContatosMap.adicionarContato("Erick Daniel", 1111111);
		agendaContatosMap.adicionarContato("Erick DCO", 654987);
		agendaContatosMap.adicionarContato("Maria Silva", 1111111);
		agendaContatosMap.adicionarContato("Erick", 44444);
		
		agendaContatosMap.exibirContatos();
		
		agendaContatosMap.removerContato("Maria Silva");
		agendaContatosMap.exibirContatos();
		
		System.out.println("O número é: " + agendaContatosMap.pesquisarPorNome("Erick DCO"));
		
		System.out.println();
		
		//PESQUISA MAP
		System.out.println("PESQUISA MAP");
		EstoqueProdutos estoque = new EstoqueProdutos();
		estoque.exibirProdutos();
		
		estoque.adicionarProduto(1L, "Produto A", 5.0, 10);
		estoque.adicionarProduto(2L, "Produto B", 10.0, 5);
		estoque.adicionarProduto(3L, "Produto C", 15.0, 2);
		
		estoque.exibirProdutos();
		
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
		
		System.out.println();
		
		//ORDENACAO MAP
		System.out.println("ORDENACAO MAP");
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 15), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 27), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 28), "Evento 2", "Atração 2");

		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}

}
