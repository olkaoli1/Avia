package ru.netology.tasks;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private String from;
    private String to;
    private int price;
    private int timeFrom;
    private int timeTo;

    public Ticket(int id, String from, String to, int price, int timeFrom, int timeTo) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public int getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getPrice() {
        return price;
    }

    public int getTimeFrom() {
        return timeFrom;
    }

    public int getTimeTo() {
        return timeTo;
    }

    @Override
    public int compareTo(Ticket other) {
        return Integer.compare(this.price, other.price);
    }
}