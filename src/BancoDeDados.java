import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados{


	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/NOMEDOBANCO?useTimezone=true&serverTimezone=UTC","UserADM","SENHA");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}


}