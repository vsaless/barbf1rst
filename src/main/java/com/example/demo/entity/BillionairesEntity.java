package com.example.demo.entity;


import javax.persistence.*;

@Entity
@Table(name="billionaires")
public class BillionairesEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name")
    private String nome;

    @Column(name = "last_name")
    private String sobrenome;

    @Column(name = "career")
    private String carreira;

    public BillionairesEntity(){

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

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;

    }

    public String getSobrenome() {

        return sobrenome;

    }

    public void setCarreira(String carreira) {
        this.carreira = carreira;

    }

    public String getCarreira() {

        return carreira;

    }
}



