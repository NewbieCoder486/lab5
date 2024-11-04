package comp31.koshti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import comp31.koshti.model.EventList;



@Controller 
@RequestMapping("/event")
@SessionAttributes("eventList")
public class EventController {

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
    
}
