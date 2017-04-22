package com.coach.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coach.model.Coach;

public class CoachDao {

	@Autowired
	private CoachRepository coachRepository;

	public Coach getCoachInfo(long id) {
		return coachRepository.findOne(id);
	}

	/**
	 * Update coach information based on id
	 * @param id
	 * @param name
	 * @return
	 */
	public String updateCoachInfo(long id, String name) {
		try
		{
			Coach coach = coachRepository.findOne(id);
			coach.setName(name);
			coachRepository.save(coach);
		}
		catch(Exception e)
		{
			return "Exception while updating coach "+e;
		}
		return "Successfully updated information of coach.";
	}

	public Iterable<Coach> getAllCoach()
	{
		return coachRepository.findAll();
	}

	public long addNewCoach(Coach coach) {

		coachRepository.save(coach);
		return coach.getId();
	}
	
	public Coach getCoachBySport(String sport)
	{
		return coachRepository.findBySport(sport);
	}

}
