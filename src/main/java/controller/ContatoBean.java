package controller;

import model.Contato;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class ContatoBean implements Serializable {

    private Contato contato = new Contato();

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String salvarContato() {
        // lógica de salvar

        return "Sucesso";
    }

    public String editarContato() {
        // lógica de editar

        return "Sucesso";
    }

    public void excluirContato() {
        //lógica para excluir do banco
    }



}
