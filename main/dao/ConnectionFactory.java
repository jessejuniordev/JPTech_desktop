package main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jessejunior
 */
public class ConnectionFactory {
    
    //"jdbc:mysql://localhost:3306/banco"
    private static final String DB_PREFIX = "jdbc:mysql://";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_NAME = "jptech";
    private static final String DB_URL = DB_PREFIX+DB_HOST+":"+DB_PORT+"/"+DB_NAME;
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root"; // Alterar de acordo com seu banco
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private static Connection con = null;
    
    // Construtor privado para nenhuma outra classe criar uma nova instância usando o new Database()
    private ConnectionFactory() {}
    
    /**
     * Criar uma conexão DB
     * @return Connection
     */
    public static Connection getConnection() {
        try {
            if (con == null) {
                // Carregar o Driver para comunicar com o DB
                Class.forName(JDBC_DRIVER);
                // API_JDBC que estabelece comunicação com o DB
                con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                System.out.println("Conectado");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    return con;
    }
    
    public static void closeConnection() {
        try {
            if(con != null) {
                con.close();
                System.out.println("Desconectado");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
}
