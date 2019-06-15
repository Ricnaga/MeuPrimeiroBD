import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroNoBD {
	private int BD_id;
	private String BD_Nome;
	private double BD_Qtd;
	private double BD_Peso;

	public static void main(String[] args)throws SQLException, RuntimeException {
		Connection BD = null;
			
		try{
			BD = new BancoDeDados().getConnection();
			System.out.println("Banco de dados conectado");
			
			String SQL = "insert into item"+"(Id, Nome, Qtd, Peso)"+"values("+1+", ?,"+3+",?)";
			PreparedStatement InsereNoBD = BD.prepareStatement(SQL);
			
			InsereNoBD.setString(1, "Leite");
			InsereNoBD.setString(2, "5.0kg");
			
			InsereNoBD.execute();
			}finally {
				BD.close();
				System.out.println("Banco de dados fechado");
			}
		}
}