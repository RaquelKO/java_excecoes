
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) { // try-with-resources
			conexao.leDados(); 
			// A conexão irá ser fechada automaticamente devido ao contrato com a interface AutoClosable
			// Dessa maneira o finally está implicito e o try funciona mesmo sem o catch
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		}
		
		
		// --------------------------------------------
		
//		Conexao con = null;
		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexao");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				// con.fecha();
//				con.close();
//			}
//		}
	}
}
