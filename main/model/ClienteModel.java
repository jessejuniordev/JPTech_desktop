package main.model;

/**
 *
 * @author jessejunior
 */
public class ClienteModel {
    // Atributos
    private int id;
    private String nome;
    private String cpf;
    private String genero;
    private String celular;
    private String empresa;
    private String area;
    
    // Contrutor vázio, para definir os valores utilizando os get/set
    public ClienteModel() {}
    
    
    // Métodos getters e setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
}
