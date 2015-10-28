package ch.erard22.playground.deltaspikedata.repository;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * Created by michel on 26.10.15.
 */
public class EntityManagerProducer {


    @PersistenceUnit
    private EntityManagerFactory emf;

    @Produces
    public EntityManager create() {
        return emf.createEntityManager();
    }


    public void close(@Disposes  EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }
}
