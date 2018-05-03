/**
 * 
 * @author Guilherme de Lima
 *@date 01/05/2018
 *
 */
public class ContaCorrente {
	private float valor;
	private boolean aberto;
	public ContaCorrente(){
	this.aberto = false;
	this.valor = 100.0f;
	}
	public void abrirConta(){
	this.aberto = true;
	}

	public void sacar(float valorSaque) throws SaldoInsuficienteException, SaqueNegativoException, ContaFechadaException{
	if(this.aberto == false){
	throw new ContaFechadaException();
	} else if(valorSaque <= 0.0f){
	throw new SaqueNegativoException();
	} else if(valorSaque > this.valor){
	throw new SaldoInsuficienteException();
	} else {
	this.valor -= valorSaque;
	}
	}
	/**
	* 
	* @return Retorna o saldo disponivel
	*/
	public float getValor() {
	return valor;
	}

	/**
	* 
	* @param Valor que define o saldo disponivel
	*/
	public void setValor(float valor) {
	this.valor = valor;
	}

}
