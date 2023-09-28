package application;

public class Contato {

	private String nome;
	private String telefone;
	private String data;
	private String email;

	public Contato(String nome, String telefone, String data, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getData() {
		return data;
	}

	public String toString() {
		return nome + ", " + telefone + ", " + email + ", " + data;
	}
}
