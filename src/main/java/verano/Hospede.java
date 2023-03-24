package verano;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospede {

	private DadosPessoais dadosPessoais;
	private String email;
	
	List<Telefone> telefones = new ArrayList<>();
	
	List<Veiculo> veiculo = new ArrayList<>();

	public Hospede(String nome, String cpf, LocalDate nascimento, String email, List<Telefone> telefones, List<Veiculo> veiculo) {
		this.dadosPessoais = new DadosPessoais(nome, cpf, nascimento);
		this.email = email;
		this.telefones = telefones;
		this.veiculo = veiculo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return dadosPessoais.toString() + 
				"\nEmail: " + email + 
				"\nTelefone: " + this.getTelefones().toString() +
				"\nVeículos: " + this.getVeiculo().toString();
	}

}
