package verano;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Hospede hospede = new Hospede("gustavo", "111.111.111-11", LocalDate.of(1980, Month.MARCH, 13),
				"gustavo@gmail.com", Arrays.asList(new Telefone("99999-9999"), new Telefone("99999-9999")), 
				Arrays.asList(new Veiculo(MarcaVeiculo.AGRALE, "amarelo", "xxx0101", 2007, "800L"),
						new Veiculo(MarcaVeiculo.ASTON_MARTIN, "verde", "yyy0202", 2023, "803D")));

		System.out.println(hospede.toString());

	}

}
