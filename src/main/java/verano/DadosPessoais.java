package verano;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DadosPessoais {

	private String nome;
	private String cpf;
	private  LocalDate dataNascimento;
	
	public DadosPessoais(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Nome: " + this.getNome().toUpperCase() + 
				"\ncpf: " + this.getCpf() + 
				"\nData de Nascimento: " + formatter.format(this.getDataNascimento()); 
	}

}
