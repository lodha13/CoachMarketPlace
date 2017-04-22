package com.coach.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.coach.model.Coach;

@Transactional
public interface CoachRepository extends CrudRepository<Coach, Long> {

	public Coach findBySport(String sport);
}