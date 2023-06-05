package Cadastros;

public class Pessoas {
	private int idPessoa;
	private String nomePessoa;
	private String email;
	
	//Construtor
	public Pessoas() {
	}
	
	public Pessoas(String nomePessoa, String email) {
//		super() é usado para chamar o construtor da classe pai em uma classe filha em Java. 
//		Ele executa o código da classe pai antes do código da classe filha.
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
		}
	

	public Pessoas(int idPessoa, String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
