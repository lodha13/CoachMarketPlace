package app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ApplicationController {

    @RequestMapping("/hi")
    public String index() {
    	System.out.println("hi root");
        return "Hi root";
    }

    @RequestMapping("/getDetails")
    public String getDetails() {
    	System.out.println("getdetails");
        return "getdetails";
    }
}