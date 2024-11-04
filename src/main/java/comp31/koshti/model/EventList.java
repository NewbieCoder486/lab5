package comp31.koshti.model;

import java.util.ArrayList;
import java.util.List;

public class EventList extends ArrayList<Event>{
    List<Event> eventList = new ArrayList<Event>();
    
        
    //     public EventList() {
    //         // super(eventId, eventName, evenrType);
    //         // this.eventList = eventList;
    // }

    public EventList() {
        eventList.add(new Event(1, "Tech Conference 2024", "Conference"));
        eventList.add(new Event(2, "Jazz Night", "Music"));
        eventList.add(new Event(3, "Startup Workshop", "Workshop"));
        eventList.add(new Event(4, "Food Festival", "Festival"));
        eventList.add(new Event(5, "Art Exhibition", "Exhibition"));
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    
}
