package com.jpassion.di.dao;

import org.springframework.stereotype.Repository;

@Repository("courseDao")
public class CourseDaoImpl implements CourseDao {

	public String getCourseName() {
		return "Spring Programming";
	}

}
