package verano;

public class Veiculo {

	private MarcaVeiculo marca;
	private String cor;
	private String placa;
	private int ano;
	private String numeroVaga;
	
	public Veiculo(MarcaVeiculo marca, String cor, 
		   String placa, int ano, String numeroVaga) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.ano = ano;
		this.numeroVaga = numeroVaga;
	}

	public MarcaVeiculo getMarca() {
		return marca;
	}

	public void setMarca(MarcaVeiculo marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNumeroVaga() {
		return numeroVaga;
	}

	public void setNumeroVaga(String numeroVaga) {
		this.numeroVaga = numeroVaga;
	}
	
	public String toString() {
		return "[Marca: " + this.getMarca() +
			   " - Cor: " + this.getCor() +
			   " - Placa: " + this.getPlaca() + 
			   " - Ano: " + this.getAno() + 
			   " - Vaga nº: " + this.getNumeroVaga() + "]\n";
	}
	
}
