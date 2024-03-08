package controller;

import dao.ContatoDAO;
import model.Contato;

import javax.annotation.ManagedBean;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
@ManagedBean
public class ContatoBean implements Serializable {
    private Contato contato = new Contato();
    private List<Contato> listaContatos;
    @Inject
    private ContatoDAO dao;

    public void listarContatos() {
        listaContatos = dao.listarContatos();
    }

    public void salvarContato() {
        dao.salvarContato(contato);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato salvo com sucesso!", null));
        contato = new Contato();
    }

    public void editarContato() {
        dao.editarContato(contato);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato editado com sucesso!", null));
    }

    public void excluirContato() {
        dao.excluirContato(contato);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato excluído com sucesso!", null));
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public List<Contato> getListaContatos() {
        return listaContatos;
    }
}
