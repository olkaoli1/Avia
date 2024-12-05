package ru.netology.tasks;

import java.util.Objects;

public class Ticket extends Product implements Comparable<Ticket> {
    private String from;
    private String to;
    private int timeFrom;
    private int timeTo;

    public Ticket(int id, String name, int price, String from, String to, int timeFrom, int timeTo) {
        super(id, name, price);
        this.from = from;
        this.to = to;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getTimeFrom() {
        return timeFrom;
    }

    public int getTimeTo() {
        return timeTo;
    }

    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return price == ticket.price &&
                timeFrom == ticket.timeFrom &&
                timeTo == ticket.timeTo &&
                Objects.equals(from, ticket.from) &&
                Objects.equals(to, ticket.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, price, timeFrom, timeTo);
    }
}
