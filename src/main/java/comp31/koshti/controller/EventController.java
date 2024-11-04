package comp31.koshti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comp31.koshti.model.EventList;



@Controller 
@RequestMapping("/event")
public class EventController {

    EventList eventList = new EventList(); 
    
    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    

    @GetMapping("/list")
    public String getEventList(Model model) {
        model.addAttribute("eventList", eventList.getEventList());

        return "event/list";
    }
    
}
