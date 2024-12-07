package ru.netology.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AviaSoulsTest {

    @Test
    public void testAddAndFindAllTickets() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        aviaSouls.add(ticket1);

        Ticket[] expected = {ticket1};
        Ticket[] actual = aviaSouls.findAll();

        assertArrayEquals(expected, actual, "Expected array should match the actual array of tickets");
    }

    @Test
    public void testSearchFindsMultipleTickets() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Сочи", 3000, 600, 720);
        Ticket ticket3 = new Ticket(3, "Москва", "Сочи", 7000, 600, 720);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);

        Ticket[] expected = {ticket2, ticket1, ticket3};
        Ticket[] actual = aviaSouls.search("Москва", "Сочи");

        assertArrayEquals(expected, actual, "Tickets should be sorted by price in ascending order");
    }

    @Test
    public void testSearchFindsOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Казань", 3000, 600, 720);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);

        Ticket[] expected = {ticket1};
        Ticket[] actual = aviaSouls.search("Москва", "Сочи");

        assertArrayEquals(expected, actual, "Expected to find one matching ticket");
    }

    @Test
    public void testSearchFindsNoTickets() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Москва", "Сочи", 5000, 600, 720);
        Ticket ticket2 = new Ticket(2, "Москва", "Казань", 3000, 600, 720);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);

        Ticket[] expected = {};
        Ticket[] actual = aviaSouls.search("Москва", "Новосибирск");

        assertArrayEquals(expected, actual, "Expected to find no matching tickets");
    }
}