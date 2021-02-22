package br.com.FelipeN.tabelaProdutos.Controller.Form;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import br.com.FelipeN.tabelaProdutos.modelo.Produto;
import br.com.FelipeN.tabelaProdutos.repository.ProdutoRepository;

public class AtualizacaoProdutoForm {
	
	@NotNull @NotEmpty
	private int estoque;
	
	@NotNull @NotEmpty
	private float valor;

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Produto atualizar (Long id, ProdutoRepository produtoRepository) {
		Produto produto = produtoRepository.getOne(id);
		produto.setValor(this.valor);
		produto.setEstoque(this.estoque);
		return produto;
	}
	

}
