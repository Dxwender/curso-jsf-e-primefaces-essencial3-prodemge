package com.algaworks.erp.model;
//Enum para o auxlio na criaçao e ineçao de atributos e tabelas 
public enum TipoEmpresa {
	
	MEI("Microempreendedor Individual"), 
	EIRELI("Empresa Individual de Responsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;

	TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
