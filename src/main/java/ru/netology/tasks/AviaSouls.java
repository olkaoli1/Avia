package ru.netology.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AviaSouls {
    private List<Ticket> tickets = new ArrayList<>();

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public Ticket[] findAll() {
        return tickets.toArray(new Ticket[0]);
    }

    public Ticket[] search(String from, String to) {
        List<Ticket> result = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.getFrom().equals(from) && ticket.getTo().equals(to)) {
                result.add(ticket);
            }
        }
        Ticket[] resultArray = result.toArray(new Ticket[0]);
        Arrays.sort(resultArray);
        return resultArray;
    }
}