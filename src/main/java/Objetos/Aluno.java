/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author danilo.asilv10
 */
public class Aluno {
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    
    
    
    public Aluno(String nome, String email, String telefone, String dataNascimento){
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
       
    
}
