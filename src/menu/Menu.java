package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String title;
    private List<Option> options = new ArrayList<>() {
    };

    public Menu() {}

    public Menu(String title) {
        this.title = title;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void addNewOption(String descr) {
        Option op = new Option(this.options.size() + 1, descr);
        this.options.add(op);

    }

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {

        return "\n" + title + "\n" +
                options;
    }
}
