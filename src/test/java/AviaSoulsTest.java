package ru.netology.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AviaSoulsTest {

    @Test
    public void testAddAndFindAll() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Ticket1", 5000, "Москва", "Сочи", 1000, 1200);
        aviaSouls.add(ticket1);

        Ticket[] result = aviaSouls.findAll();
        assertEquals(1, result.length);
        assertEquals(ticket1, result[0]);
    }

    @Test
    public void testSearch() {
        AviaSouls aviaSouls = new AviaSouls();

        Ticket ticket1 = new Ticket(1, "Ticket1", 5000, "Москва", "Сочи", 1000, 1200);
        Ticket ticket2 = new Ticket(2, "Ticket2", 3000, "Москва", "Сочи", 1000, 1200);
        Ticket ticket3 = new Ticket(3, "Ticket3", 7000, "Москва", "Сочи", 1000, 1200);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);

        Ticket[] result = aviaSouls.search("Москва", "Сочи");

        assertEquals(3, result.length);
        assertEquals(ticket2, result[0]); // Самый дешевый билет
        assertEquals(ticket1, result[1]);
        assertEquals(ticket3, result[2]); // Самый дорогой билет
    }
}
