
public class conta {
	
	int saldo;
	int agencia;
	int numero;
	// Para referenciar uma classe em outra nome da classe objeto;
	cliente titular;
	
	
	public void deposita (double valor) {
		
		this.saldo += valor;
		
	}
	
	public boolean saca (double valor) {		
		if (this.saldo >= valor) {	
			return true;
			}else {
				return false;
			}
	}
		
	public boolean transferencia (double valor, conta destino, conta origem) {
		
		if(origem.saca(valor)) {
			return true;
		}else { return false;
		}
		
	
	}
}
