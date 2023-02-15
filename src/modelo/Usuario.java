/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author temporario
 */
public class Usuario {
    private String nome;
    private String telefone;
    private String login;
    private String senha;  
    private int cargo;
    private boolean ehAdmin;
    
    
    public Usuario(){}
    
    public Usuario(String nome,String telefone, String login, String senha, int cargo, boolean ehAdmin){
    this.ehAdmin = ehAdmin;
    this.nome = nome;
    this.telefone = telefone;
    this.login = login;
    this.senha = senha;
    this.cargo = cargo;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public boolean isEhAdmin() {
        return ehAdmin;
    }

    public void setEhAdmin(boolean ehAdmin) {
        this.ehAdmin = ehAdmin;
    }
    
 
}


