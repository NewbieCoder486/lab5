package comp31.koshti.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventList extends ArrayList<Event>{
    List<Event> eventList = new ArrayList<Event>();
    
        
    //     public EventList() {
    //         // super(eventId, eventName, evenrType);
    //         // this.eventList = eventList;
    // }

    public EventList() {
       eventList.add(new Event(1, "Tech Conference 2024", "Conference", LocalDate.of(2023, 03, 11)));
       eventList.add(new Event(2, "Jazz Night", "Music", LocalDate.of(2023, 10, 01)));
       eventList.add(new Event(3, "Startup Workshop", "Workshop", LocalDate.of(2012, 9, 21)));
       eventList.add(new Event(4, "Food Festival", "Festival", LocalDate.of(2008, 12, 03)));
       eventList.add(new Event(5, "Art Exhibition", "Exhibition", LocalDate.of(2017, 9, 8)));
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    
}
