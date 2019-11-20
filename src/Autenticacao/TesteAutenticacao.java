/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticacao;

/**
 *
 * @author LABORATORIO_INFO
 */
public class TesteAutenticacao {
    
    public static void main(String[] args) {
        
        AUsuario teste = new AUsuario();
        
        AUsuario teste2 = new AUsuario("TestandoUsuario");
        
        teste.setUsuario("Etecia");
        teste.setSenha("etecia");
        
        System.out.println("Usuario: "+teste.getUsuario());
        System.out.println("Senha: "+teste.getSenha());
        System.out.println("Senha: "+teste2.getSenha());
    }
}
