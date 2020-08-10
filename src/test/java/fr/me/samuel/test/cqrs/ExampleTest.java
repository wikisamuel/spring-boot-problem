package fr.me.samuel.test.cqrs;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.me.samuel.test.cqrs.model.Dirigeant;
import fr.me.samuel.test.cqrs.repositories.DirigeantRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = { "spring.main.allow-bean-definition-overriding=true", "logging.level.root=DEBUG" })
class ExampleTest {

    @Autowired
    DirigeantRepository dirigeantRepository;

    @Test
    void test() {
        List<Dirigeant> d = dirigeantRepository.findAll();
        assertEquals(20000, d.size());
    }

}
