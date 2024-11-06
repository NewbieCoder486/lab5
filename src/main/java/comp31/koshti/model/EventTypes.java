package comp31.koshti.model;

import org.springframework.stereotype.Component;

@Component
public class EventTypes {
    String[] eventTypes = {"Concert", "Exhibition", "Stand-up"};

    public String[] getEventTypes() {
        return eventTypes;
    }
    
}
