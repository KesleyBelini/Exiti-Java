package dao;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import model.Contato;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements Serializable {
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Contato> listarContatos() {
        String jpql = "SELECT c FROM Contato c";
        TypedQuery<Contato> query = entityManager.createQuery(jpql, Contato.class);
        return query.getResultList();
    }

    @Transactional
    public void salvarContato(Contato contato) {
        entityManager.persist(contato);
    }

    @Transactional
    public void editarContato(Contato contato) {
        entityManager.merge(contato);
    }

    @Transactional
    public void excluirContato(Contato contato) {
        try {
            contato = entityManager.merge(contato);
            entityManager.remove(contato);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Erro ao excluir o contato: " + e.getMessage(), e);
        }

    }

    @Transactional
    public void excluirContatoPorId(Integer contatoId) {
        Contato contato = entityManager.find(Contato.class, contatoId);
        if (contato != null) {
            entityManager.remove(contato);
        }
    }
}
