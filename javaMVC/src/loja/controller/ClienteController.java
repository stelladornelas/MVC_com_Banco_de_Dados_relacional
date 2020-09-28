
package loja.controller;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import loja.DAO.ClienteDAO;
import loja.DAO.ExceptionDAO;
import loja.model.Cliente;

public class ClienteController {
    
    public boolean cadastrarCliente(String nome, String cpf, String email) throws ParseException, ExceptionDAO, SQLException{
     if (nome != null && nome.length() > 0 && validarCPF(cpf) && email != null
                && email.length() > 0 ) {
        
            Cliente cliente = new Cliente(nome, cpf, email);
            ClienteDAO dao = new ClienteDAO();
            dao.cadastrarCliente(cliente);
            return true;        }        return false;   
            }
         public boolean validarCPF(String CPF) {
        for (int i = 0; i < CPF.length(); i++) {
            if (!Character.isDigit(CPF.charAt(i))) {
                if (!(i == 3 || i == 7 || i == 11)) {
                    return false;               }           }        }
        return true;    }
    public boolean validarData(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                if (!(i == 2 || i == 5)) {
                    return false;                }            }        }
        return true;    }

    public List<Cliente> listarClientes (String nome) throws ExceptionDAO, SQLException{
        ClienteDAO dao = new ClienteDAO();
        return dao.listarClientes(nome);
    }

    public boolean cadastrarCliente(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}