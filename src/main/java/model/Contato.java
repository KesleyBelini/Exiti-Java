package model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Basic(optional = false)
    @Column
    private String nome;

    @Basic(optional = false)
    @Column
    private String email;

    @Basic(optional = false)
    @Column
    private String telefone;


    public Contato() {
        /*
        criando um construtor vazio
        isso serve para que ele crie o objeto sem a necessidade de parametros, entre outras coisas...
        */
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
