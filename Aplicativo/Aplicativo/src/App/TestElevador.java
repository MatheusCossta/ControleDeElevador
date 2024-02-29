package App;
 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Entidade.Elevador;
import Entidade.Pessoa;
 
class Testes {
	Pessoa pessoa = new Pessoa();
	Elevador elevador = new Elevador();
	@Test
	void test() {
		pessoa.setPeso(250);
		double resultado = elevador.entrarNoElevador(pessoa.getPeso());
		assertEquals(resultado, 250);
	}
	@Test
	void test2() {
		elevador.setCargaMaxima(200);
		boolean resultado = elevador.avaliarPeso(elevador.getCargaAtual());
		assertEquals(resultado, false);
	}
 
}