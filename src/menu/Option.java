package menu;

public class Option {
    private int id;
    private String descr;

    public Option(int id, String descr) {
        this.id = id;
        this.descr = descr;
    }

    public int getId() {
        return id;
    }

    public String getDescr() {
        return descr;
    }

    @Override
    public String toString() {
        return id + ". " + descr + "\n";
    }
}
