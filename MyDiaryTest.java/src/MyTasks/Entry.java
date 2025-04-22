package MyTasks;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String content;
    private LocalDate date ;

    public Entry(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = LocalDate.now();
    }
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }
}
