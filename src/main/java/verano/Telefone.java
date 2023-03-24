package verano;

public class Telefone {

	private String telefone;
	
	public Telefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String toString() {
		return getTelefone();
	}
}
