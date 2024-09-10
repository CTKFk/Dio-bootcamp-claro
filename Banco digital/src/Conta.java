public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected  double limite;  
	protected double saldoComLimite;
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.limite = limite;  
	}	

	@Override
	public void sacar(double valor) {
		double saldoComLimite = method();
		if(valor <= saldoComLimite)	
			if(valor <= saldo) {
				saldo -= valor;
			}
			else
			{
				limite -= (valor - saldo);
				saldo = 0;
			}
		else{
			System.out.println("Saldo insuficiente");
		}
	}		
		public void atualizarLimite() {
			this.limite = this.saldo * 0.1;
		}

		@Override
		public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Valor invalido");
		}
		else{
			saldo += valor;
		}
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {

		if (valor >= saldoComLimite) {
			if(valor <= 0) {
				System.out.println("Valor invalido");
			}
			else{
			this.sacar(valor);
			contaDestino.depositar(valor);
			}
		}
		else{
			System.out.println("Saldo insuficiente");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Limite: %.2f", this.limite));
	}

    private double method() {
        double saldoComLimite = this.saldo + this.limite;
        return saldoComLimite;
    }

}