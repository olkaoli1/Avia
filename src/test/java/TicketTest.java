package ru.netology.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    public void testCompareTo() {
        Ticket ticket1 = new Ticket(1, "Ticket1", 5000, "Москва", "Сочи", 1000, 1200);
        Ticket ticket2 = new Ticket(2, "Ticket2", 7000, "Москва", "Сочи", 1000, 1200);

        assertTrue(ticket1.compareTo(ticket2) < 0);
        assertTrue(ticket2.compareTo(ticket1) > 0);
        assertEquals(0, ticket1.compareTo(ticket1));
    }
}
