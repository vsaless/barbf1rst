
package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name ="Contato")
public class ContatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="email")
    private String email;

    @Column(name ="telefone")
    private String telefone;

    @Column(name ="mensagem")
    private String mensagem;

    public ContatoEntity(){

    }

    public void setId(Integer id){
        this.id=id;

    }

    public Integer getId() {
        return id;
    }


    public void setNome (String nome){
        this.nome=nome;
    }


    public String getNome() {
        return nome;
    }

    public void setCpf (String cpf) {

        this.cpf=cpf;

    }

    public String getCpf() {

        return cpf.trim();
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}