package com.experiment.jpaexperiment.reposity;

import com.experiment.jpaexperiment.entity.Address01;
import com.experiment.jpaexperiment.entity.User01;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress() {
        User01 user = new User01("Bob");
        em.persist(user);
        Address01 address1 = new Address01("956");
        address1.setUser(user);
        em.persist(address1);

        Address01 address2 = new Address01("925");
        address2.setUser(user);
        em.persist(address2);
    }
}