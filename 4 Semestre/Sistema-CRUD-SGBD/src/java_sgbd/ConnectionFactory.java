package java_sgbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionFactory {
	//como diria Json = vamos por partes! Aqui separei cada parte dos dados da minha conex�o mySQL a Java.
	
	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.driver";
	private static final String server = "127.0.0.1";
	private static final String port = "3306";
	private static final String db = "clcmo_sis_alugai";
	private static final String url = "jdbc:mysql://"+ server +":"+ port +"/"+db;
	private static final String user = "root";
	private static final String pass = "IAULeW0MFdqcdcPF";
	
	//metodo (embora em branco) que possui o mesmo nome da classe. Ele ser� util no Main e no DAO
	private ConnectionFactory() {}
	
	//iniciando a conex�o pelo m�todo getConnection
	public static synchronized Connection getConnection() {
		if (conn == null) {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Erro ao carregar o driver de conex�o\n" + e);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "N�o foi poss�vel estabalecer conex�o com o banco de dados\n" + e);
			}
		}
		JOptionPane.showMessageDialog(null, "Bem Vindos!");
		return conn;
	}
	
	//fechando a minha conex�o com o m�todo CloseConnection
	 
    public static boolean CloseConnection() {
        try {
            ConnectionFactory.getConnection().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
 
    //reiniciando a minha conex�o com o m�todo Restart
 
    public static Connection Restart() {
        CloseConnection();
        return ConnectionFactory.getConnection();
    }
}
