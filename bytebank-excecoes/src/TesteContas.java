
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		//cc.transfere(10.0, cp);
		// Para compilar o método transfere precisamos: inseri-lo num bloco try/catch ou, 
		// indicar que é possível haver uma exceção na chamada do método main
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		//ContaCorrente cc2 = new ContaCorrente(-111,111);
	}

}
