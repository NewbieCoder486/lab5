package comp31.koshti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import comp31.koshti.model.Event;
import comp31.koshti.model.EventList;
import comp31.koshti.model.EventTypes;
import org.springframework.web.bind.annotation.PostMapping;





@Controller 
@RequestMapping("/event")
@SessionAttributes("eventList")
public class EventController {

    EventTypes eventTypes;

    public EventController(EventTypes eventTypes){
        this.eventTypes = eventTypes;
    }

    @ModelAttribute("eventList")
    public EventList createEventList(){
        EventList newEvent = new EventList();

        return newEvent;
    }

    // EventList eventList = new EventList(); 
    
    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    

    @GetMapping("/list")
    public String getEventList(Model model, @ModelAttribute("eventList") EventList eventList) {
        model.addAttribute("eventList", eventList.getEventList());

        return "event/list";
    }

    @GetMapping("/add")
    public String getAddedEvent(Model model, Event event) {
        model.addAttribute("event", event);
        model.addAttribute("eventTypes", eventTypes.getEventTypes());
        return "event/add";
    }
    // private static Integer idIncrement = event.getId();
    
    @PostMapping("/add")
    public String postEvents(Model model,Event event, @ModelAttribute("eventList") EventList eventList) {
        Integer idIncrement = 5;
        // Integer idIncrement= 0;
        event.setId(idIncrement++);
        // eventList.add(event);
        eventList.add(new Event(idIncrement++, event.getName(), event.getType(), event.getEventDate()));
        eventList.setEventList(eventList);
        model.addAttribute("eventList", eventList.getEventList());

        System.err.println(event.getName());
        System.err.println(event.getType());
        System.err.println(event.getId());
        System.err.println(event.getEventDate());
        
        return "redirect:/event/list";
    }
    
}
