package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // <<== Ajouté
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // <<== Correction ici aussi
public class BlocServiceTest {

    @BeforeAll
    void bedore() {
        System.out.println("Avant tous les tests");
    }

    @AfterAll
    void after() {
        System.out.println("Après tous les tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Avant chaque test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Après chaque test");
    }

    @Order(1)
    @RepeatedTest(4)
    void test() {
        System.out.println("Test répété");
    }

    @Order(4)
    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Order(2)
    @Test
    void test3() {
        System.out.println("Test 3");
    }

    @Order(3)
    @Test
    void test4() {
        System.out.println("Test 4");
    }
}
