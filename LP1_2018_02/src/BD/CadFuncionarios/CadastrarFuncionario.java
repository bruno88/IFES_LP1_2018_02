package BD.CadFuncionarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class CadastrarFuncionario {

	public static void main(String[] args) throws SQLException {
		final String connectionString = "jdbc:mysql://localhost/testes_funcionario?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		final String USERNAME = "testes", PWD = "asd";
		Funcionario funcionario;
		String condicao = "S";
		String sql = "insert into funcionario (nome,funcao,"
				+ "idade,salario) values (?,?,?,?)";
		
		try {
			Connection conexao = DriverManager.getConnection(
					connectionString, USERNAME, PWD);

			System.out.println("Conectado!");

			do {
				
				String nome = JOptionPane.showInputDialog("Digite o Nome: ");
				String funcao = JOptionPane.showInputDialog("Digite a Fun��o: ");
				int idade = Integer.valueOf(JOptionPane.showInputDialog("Digite a Idade: "));
				double salario = Double.valueOf(JOptionPane.showInputDialog("Digite o Sal�rio: "));

				funcionario = new Funcionario(nome, funcao, idade, salario);

				PreparedStatement query = conexao.prepareStatement(sql);

				query.setString(1, funcionario.getNome());
				query.setString(2, funcionario.getFuncao());
				query.setInt(3, funcionario.getIdade());
				query.setDouble(4, funcionario.getSalario());

				query.execute();
				query.close();

				condicao = JOptionPane.showInputDialog("Deseja cadastrar outro funcion�rio (S ou N)? ");
				
			}while (condicao.equalsIgnoreCase("S")) ;

			conexao.close();
			System.out.println("Conex�o finalizada!");
			
		}catch(SQLException ex){
			System.out.println("Erro ao conectar ao banco: " + ex);
		}

	}
}




