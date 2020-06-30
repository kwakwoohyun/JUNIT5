package me.whiteship.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    void create1() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create1");
    }

    @Test
    @Disabled
    void create2() {
        System.out.println("create2");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("befor All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after All");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

}