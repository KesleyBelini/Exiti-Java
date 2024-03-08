package controller;

import dao.ContatoDAO;
import jakarta.persistence.PostPersist;
import model.Contato;
import org.primefaces.util.Lazy;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
@Named
public class ContatoBean implements Serializable {

    private Contato contato = new Contato();
    private List<Contato> listaContatos;
    @Inject
    private ContatoDAO contatoDAO;

    public void listarContatos() {
        listaContatos = ContatoDAO.listarContatos;
    }

    public void salvarContato() {
        contatoDAO.salvarContato(contato);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato salvo com sucesso!", null));
        contato = new Contato();
    }

    public void editarContato() {
        contatoDAO.editarContato(contato);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato editado com sucesso!", null));
    }

    public void excluirContato() {
        contatoDAO.excluirContato(contato);
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
