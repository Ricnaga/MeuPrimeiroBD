import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MeuPrimeiroBD_bkp {
	
	private int Id;
	private String Nome;
	private int Qtd;
	private double Peso;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection BD = null;
		
		try{
			BD = new MeuPrimeiroBD_bkp().AbreConexao();
			System.out.println("Banco de dados conectado");
		
			MeuPrimeiroBD_bkp Usuarios = new MeuPrimeiroBD_bkp();
			System.out.println(Usuarios.toString()+" serão inserços no BD");
			PreparedStatement InsereNoBD = BD.prepareStatement("insert into Item" + "(Id, Nome, Qtd, Peso)" + "values ('"+Usuarios.getId()+"','"+Usuarios.getNome()+"','"+Usuarios.getQtd()+"','"+Usuarios.getPeso()+"')");
			InsereNoBD.execute();
		
			}catch(SQLException e) {
				System.out.println(e);
			}finally {
			BD.close();
		}
		System.out.println("Banco de dados Fechado com os dados gravados");

	}
	
	public Connection AbreConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/mysqlbd1?useTimezone=true&serverTimezone=UTC","root","root");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

	@Override
	public String toString() {
		return "MeuPrimeiroBD [getId()=" + getId() + ", getNome()=" + getNome() + ", getQtd()=" + getQtd() + ", getPeso()=" + getPeso() + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getQtd() {
		return Qtd;
	}

	public void setQtd(int qtd) {
		Qtd = qtd;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

}
