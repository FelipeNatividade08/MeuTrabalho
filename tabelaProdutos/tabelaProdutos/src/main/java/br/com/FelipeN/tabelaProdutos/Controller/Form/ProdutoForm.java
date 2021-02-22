package br.com.FelipeN.tabelaProdutos.Controller.Form;

import com.sun.istack.NotNull;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.FelipeN.tabelaProdutos.modelo.Produto;

public class ProdutoForm {
	
	@NotNull @NotEmpty @Length(min = 2)
	private String nomeProduto;
	
	@NotNull @NotEmpty
	private float valor;
	
	@NotNull @NotEmpty
	private Long id;
	
	@NotNull @NotEmpty @Length(min = 2)
	private String Descricao;
	
	@NotNull @NotEmpty
	private int estoque;
	
	
	public String getProduto() {
		return nomeProduto;
	}
	public void setProduto(String produto) {
		this.nomeProduto = produto;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public Produto converter() {
		
		return new Produto(id, nomeProduto, Descricao, valor, estoque);
	}
	
	

}
