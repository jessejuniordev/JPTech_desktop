package main;

import main.dao.cliente.ClienteDAO;
import main.model.ClienteModel;

/**
 *
 * @author jessejunior
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Jesse";
        String cpf = "12345678911";
        String genero = "M";
        String celular = "(00)00000-0000";
        String empresa = "JPTech";
        String area = "Desenvolvimento";
        
        ClienteModel cliM = new ClienteModel();
        cliM.setNome(nome);
        cliM.setCpf(cpf);
        cliM.setGenero(genero);
        cliM.setCelular(celular);
        cliM.setEmpresa(empresa);
        cliM.setArea(area);
        
        ClienteDAO cliD = new ClienteDAO();
        cliD.cadastrarCliente(cliM);
    }
    
}
