
package loja.DAO;

import loja.model.Cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    public void cadastrarCliente(Cliente cliente) throws ExceptionDAO, SQLException {
        String sql = "insert into cliente( nome, cpf, email)value (?,?,?)";

        PreparedStatement pStatement = null;
        Connection connection = null;
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);

            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.execute();

        } catch (SQLException e) {
            throw new ExceptionDAO(" erro ao cadastrar cliente" + e);
        } finally { try {

                if (pStatement != null) {
                    pStatement.close();
                } } catch (SQLException e) {
                throw new ExceptionDAO(" erro " + e);
            } }
        try {

            if (connection != null) {
                connection.close();
            }    } catch (SQLException e) {

            throw new ExceptionDAO(" erro ao fechar conexao" + e);
        }    }

    public void alterarCliente(Cliente cliente) {
        String sql = "update cliente set nome=?, cpf=?, email=? where codCliente=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, cliente.getNome());
            pStatement.setString(2, cliente.getCpf());
            pStatement.setString(3, cliente.getEmail());
            pStatement.setInt(4, cliente.getId());
           pStatement.execute();
        } catch (SQLException e) {
            try {
                throw new ExceptionDAO(" Erro ao alterar cliente" + e);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {            try {
                if (pStatement != null) {
                    pStatement.close();
                }      } catch (SQLException e) {
                try {
                    throw new ExceptionDAO(" erro " + e);
                } catch (ExceptionDAO ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }            }       }        try {
            if (connection != null) {
                connection.close();            }
        } catch (SQLException e) {
            try {
                throw new ExceptionDAO(" Erro ao fechar conexao" + e);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }        }    }

    public void excluirCliente(Cliente cliente) {
        String sql = "delete from cliente where codCliente=?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
           pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, cliente.getId());
            pStatement.execute();
        } catch (SQLException e) {
            try {                throw new ExceptionDAO(" Erro ao excluir cliente" + e);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();                }
            } catch (SQLException e) {
                try {
                    throw new ExceptionDAO(" erro " + e);
                } catch (ExceptionDAO ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }           }       }
        
        try {            if (connection != null) {
                connection.close();            }
        } catch (SQLException e) {
            try {
                throw new ExceptionDAO(" erro ao fechar conexao" + e);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }        }

    }
    
       
    public List<Cliente> listarClientes(String nome) throws ExceptionDAO, SQLException {
        ResultSet rs = null;
        Connection connection = null;
        PreparedStatement pStatement = null;
        ArrayList<Cliente> listarClientes = null;
        try {
            String sql = "select * from cliente where  nome like  '%"+nome+"%' order by nome";
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            rs = pStatement.executeQuery();
            if (rs != null) {
                listarClientes = new ArrayList<>();
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("codCliente"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setEmail(rs.getString("email"));
                    listarClientes.add(cliente);
                             }           }
                 } catch (SQLException e) { e.printStackTrace();
            throw new ExceptionDAO(" Erro ao listar cliente" + e);
      
    }finally            {try { if (rs!=null) {rs.close();}
   
        } catch (SQLException e) { e.printStackTrace();}
                    try { if (pStatement!=null) {pStatement.close();}
                } catch (SQLException e) { e.printStackTrace();
      
  }        return listarClientes;}  
            }

   
   
    
 
}
