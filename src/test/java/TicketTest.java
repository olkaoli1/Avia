package ru.netology.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {

    @Test
    public void testCompareToLowerPrice() {
        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 3000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Сочи", 5000, 600, 720);

        int result = ticket1.compareTo(ticket2);

        assertTrue(result < 0, "Ticket with lower price should be considered smaller");
    }

    @Test
    public void testCompareToHigherPrice() {
        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Сочи", 3000, 600, 720);

        int result = ticket1.compareTo(ticket2);

        assertTrue(result > 0, "Ticket with higher price should be considered larger");
    }

    @Test
    public void testCompareToEqualPrice() {
        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Сочи", 5000, 600, 720);

        int result = ticket1.compareTo(ticket2);

        assertEquals(0, result, "Tickets with equal price should be considered equal");
    }
}