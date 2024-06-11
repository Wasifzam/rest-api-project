package net.javaguides.rest_app.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.rest_app.dao.CourseDao;
import net.javaguides.rest_app.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//  List<Course> list;
	
	public CourseServiceImpl() {
		
	//	list=new ArrayList<>();
	//	list.add(new Course(145,"Spring boot course","creating rest-api using spring boot "));
	//	list.add(new Course(146,"Core java course","This is core java course"));
		
	}
		
	@Override
	public List<Course> getCourses() {
	// return list;
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
		
		//  Course c=null;
		//for(Course course:list)
		//{
		//	if(course.getId()==courseId)
		//	{
		//		c=course;
		//		break;
		//	}
		//}
		
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		// list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		//list.forEach(e -> {
		//	if (e.getId() == course.getId()) {
		//		e.setTitle(course.getTitle());
		//		e.setDescription(course.getDescription());
		//	}
			
		//} );
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
