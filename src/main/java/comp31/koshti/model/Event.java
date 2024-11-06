package comp31.koshti.model;

import java.time.LocalDate;

public class Event {
    Integer id;
    String name, type;
    LocalDate eventDate;
    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Event(Integer id, String name, String type, LocalDate eventDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.eventDate = eventDate;
    }
    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", type=" + type + ", eventDate=" + eventDate + "]";
    }
    


}
