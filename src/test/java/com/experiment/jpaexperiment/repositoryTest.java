package com.experiment.jpaexperiment;

import com.experiment.jpaexperiment.reposity.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest

public class repositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addAddressTest() {
        userRepository.addUserAddress();
    }
}
