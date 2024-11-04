package comp31.koshti.model;

public class Event {
    Integer id;
    String name, type;
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
    public Event(Integer id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Event [id=" + id + ", name=" + name + ", type=" + type + "]";
    }
   


}
