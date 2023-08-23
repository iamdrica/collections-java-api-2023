package OperacoesBasicas;

public class Tarefa {

	//Atributos
	
		private String descricao;

		
		public Tarefa(String descricao) {
			super();
			this.descricao = descricao;
		}


		public String getDescricao() {
			return descricao;
		}

		//sobrescrever a String
		@Override
		public String toString() {
			return descricao;
		}

	}
