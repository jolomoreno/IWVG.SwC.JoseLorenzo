package es.upm.miw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "John", "Doe");
    }

    @Test
    void testUser() {
        user = new User(2, "Sarah", "Eod");
        assertEquals(2, user.getNumber());
        assertEquals("Sarah", user.getName());
        assertEquals("Eod", user.getFamilyName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("John", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", user.fullName());
    }
}
