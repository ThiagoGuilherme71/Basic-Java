package application;

public class Agenda {

	public Contato[] agenda;

	public Agenda() {
		agenda = new Contato[50];
	}

	public void add(String nome, String telefone, String data, String email) {

		for (int i = 0; i < agenda.length; i++) {
			if (agenda[i] == null) {
				agenda[i] = new Contato(nome, telefone, data, email);
				break;
			}
		}
	}

	public String consultar(String nome) {

		for (int i = 0; i < agenda.length; i++) {
			if (nome.equals(agenda[i].nome)) {
				return agenda[i].nome + ", " + agenda[i].telefone + ", " + agenda[i].email + ", " + agenda[i].data;
			}
		}
		return "Nenhum contato com esse nome";
	}

	public String aniversario(String mes, int j) {

		char mes1 = agenda[j].data.charAt(3);
		char mes2 = agenda[j].data.charAt(4);
		char compara1 = mes.charAt(0);
		char compara2 = mes.charAt(1);
		if (mes1 == compara1 && mes2 == compara2) {
			return agenda[j].nome + ", " + agenda[j].telefone + ", " + "Faz aniversario nesse mes: " + mes;
		}
		return "sem aniversariantes";
	}

	public String ListarTodos(int i) {
		for (; i < agenda.length; i++) {
			if (agenda[i] != null) {
				return agenda[i].nome + ", " + agenda[i].telefone + ", " + agenda[i].email + ", " + agenda[i].data;
			}
		}
		return "";
	}

}
