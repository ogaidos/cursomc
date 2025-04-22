package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	//construtores para armazenar essas variaveis
		private int cod;
		private String descricao;
		
		//construtor de tipo enumerado é private
		private EstadoPagamento(int cod, String descricao) {
			this.cod = cod;
			this.descricao = descricao;
		}
		
		//agora os gets
		public int getCod(){
			return cod;
		}
		public String getDescricao(){
			return descricao;
		}
		public static EstadoPagamento toEnum(Integer cod){
			if (cod == null) {
				return null;
			}
			for (EstadoPagamento x: EstadoPagamento.values()){
				if(cod.equals(x.getCod())){
					return x;
				}
			}
			throw new IllegalArgumentException("Id invalido: " + cod);
		}

}
