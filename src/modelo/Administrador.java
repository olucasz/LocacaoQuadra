/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author temporario
 */
public class Administrador extends Usuario {
    private int verificacao;
    
    public Administrador(int verificacao,String nome,String login, String telefone, String senha,int cargo){
    super(nome,telefone,login,senha,cargo,true);
    this.verificacao = verificacao;
    
    }
     public int getVerificacao() {
       return verificacao;
    }

    public void setVerificacao(int verificacao) {
        this.verificacao = verificacao;
    }
    
}
