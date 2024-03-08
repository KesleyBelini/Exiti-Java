package dao;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import model.Contato;

import java.util.List;

public class ContatoDAO {
    public static List<Contato> listarContatos;
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Contato> listarContatos(Contato contato) {
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
        contato = entityManager.merge(contato);
        entityManager.remove(contato);
    }

    @Transactional
    public void excluirContatoPorId(Integer contatoId) {
        Contato contato = entityManager.find(Contato.class, contatoId);
        if (contato != null) {
            entityManager.remove(contato);
        }
    }
}
