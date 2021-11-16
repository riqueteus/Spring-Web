package com.example.springbootweb.models;

import javax.persistence.*; // o * serve para incluir os imports de todos os persistences




@Entity //objeto de criação da tabela no bd
@Table(name = "administradores") //criação do nome da tabela no bd
public class Administrador {

    @Id //atributo de primary key no bd
    @GeneratedValue(strategy = GenerationType.IDENTITY) //geração de autoincremento do id de forma automática
    @Column(name = "id")
    private int id;

    @Column(name = "nome" , length = 100, nullable = false)
    private String nome;

    @Column(name = "email" , length = 100, nullable = false)
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "senha", nullable = false)
    private String senha;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
