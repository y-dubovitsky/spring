package space.dubovitsky.hibernate.dao;

import space.dubovitsky.hibernate.model.Course;

import java.util.List;

public interface CourseDao {

    List<Course> findAllCourses();

    Course getCourseById(int id);

    void deleteCourseById(int id);

    void addCourse(Course course);

    void updateCourse(Course course);

}
