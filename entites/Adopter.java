package entites;

public class Adopter {
	String cpf;
	String name;
	String endereco;
	String telefone;
	String dataDeNascimento;
	
	
	public Adopter(String cpf, String name, String endereco, String telefone, String dataDeNascimento) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Adotante Details:\n");
	    sb.append("CPF: ").append(cpf).append("\n");
	    sb.append("Name: ").append(name).append("\n");
	    sb.append("Endereco: ").append(endereco).append("\n");
	    sb.append("Telefone: ").append(telefone).append("\n");
	    return sb.toString();
	}

	
}
