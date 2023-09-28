package application;

public class Contato {

	public String nome;
	public String telefone;
	public String data;
	public String email;
	
	public Contato(String nome, String telefone, String data, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.data = data;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
