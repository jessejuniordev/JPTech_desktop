package main.dao.cliente;

import main.model.ClienteModel;
import main.dao.ConnectionFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jessejunior
 */
public class ClienteDAO {
    // Obj para executar comandos SQL
    private PreparedStatement st = null;
    
    private String sql = null;
    private int status;
    
    /**
     * 
     * @param cliente - Modelo Cliente
     * @return status - Retorna 1 se for cadastrado, 0/null se não funcionar
     */
    public int cadastrarCliente(ClienteModel cliente) {
        sql = "INSERT INTO clientes VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            st = ConnectionFactory.getConnection().prepareStatement(sql);
            
            // Inserir os dados na tabela clientes (Definina no Model)
            st.setInt(1, cliente.getId());
            st.setString(2, cliente.getNome());
            st.setString(3, cliente.getCpf());
            st.setString(4, cliente.getGenero());
            st.setString(5, cliente.getCelular());
            st.setString(6, cliente.getEmpresa());
            st.setString(7, cliente.getArea());

            status = st.executeUpdate(); // Vai retornar 1 se funcionar
            
            System.out.println("Cadastrado"); // Para testes
            return status;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
            return e.getErrorCode();
        } finally {
            ConnectionFactory.closeConnection();
        }
    }
}
