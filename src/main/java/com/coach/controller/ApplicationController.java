package com.coach.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coach.dao.CoachRepository;
import com.coach.model.Coach;

@RestController
public class ApplicationController {

	@Autowired
	private CoachRepository coachRepository;
	
	@RequestMapping(value="/getAllCoach", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Coach> getAllCoach() {
    	final Iterable<Coach> coaches = coachRepository.findAll();
        return coaches;
    }
	
    @RequestMapping(value="/getCoachInfo", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Coach getCoachInfo(@RequestParam long id) {
    	final Coach coach = coachRepository.findOne(id);
        return coach;
    }

    @RequestMapping(value="/getCoachBySport", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public Coach getCoachInfo(@RequestParam String sport) {
    	final Coach coach = coachRepository.findBySport(sport);
        return coach;
    }

    
    @RequestMapping(value="/updateInfo", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public String updateCoachInfo(@RequestParam long id, @RequestParam String name) {
    	try
    	{
    	Coach coach = coachRepository.findOne(id);
    	coach.setName(name);
    	coachRepository.save(coach);
    	}
    	catch(Exception e)
    	{
    		return "error "+e;
    	}
        return "success";
    }
    
    @RequestMapping(value="/add", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public long addNewCoach(@RequestParam String name, String sport, String phoneNumber) {

    	final Coach coach = new Coach(); 
    	coach.setName(name);
    	coach.setSport(sport);
    	coach.setPhoneNumber(phoneNumber);
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    	String date = sdf.format(new Date());
    	coach.setRegistrationDate(date);
    	coachRepository.save(coach);
    	return coach.getId();
    }
}