
public class Teste {
	
	public static void main(String[] args) {
	
	//instanciar => classe nomedaconta = new classe ();
	 
	conta contaDoPaulo = new conta();
	
	//Atribuicao de valor ao objeto dentro da classe = nomedaconta.objeto =  valor; 
	contaDoPaulo.saldo = 300;
	
	contaDoPaulo.titular = new cliente();
	
	contaDoPaulo.titular.nome = "Paulo";
	
	
	
	
	}
}
