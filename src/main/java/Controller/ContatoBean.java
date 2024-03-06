package Controller;

import Model.Contato;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class ContatoBean {

    private Contato contato;

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
