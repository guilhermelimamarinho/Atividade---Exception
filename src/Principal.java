/**
 * Parte principal
 * 
 * @author Guilherme de Lima
 *@date 01/05/2018
 */
public class Principal {
	public static void main(String[] args) throws SaldoInsuficienteException, SaqueNegativoException, ContaFechadaException{
		ContaCorrente conta = new ContaCorrente();
		//conta.abrirConta();
		conta.sacar(20.0f);
		System.out.println("Saldo restante: R$" + conta.getValor());
		}

		}

