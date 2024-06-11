package net.javaguides.rest_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.rest_app.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	

}
