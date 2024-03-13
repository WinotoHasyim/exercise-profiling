package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
    List<Student> students = studentRepository.findAll();
    List<StudentCourse> allStudentCourses = studentCourseRepository.findAll();

    Map<Long, List<StudentCourse>> studentCoursesByStudentId = allStudentCourses.stream()
        .collect(Collectors.groupingBy(sc -> sc.getStudent().getId()));

    List<StudentCourse> studentCourses = new ArrayList<>();
    for (Student student : students) {
        List<StudentCourse> studentCoursesByStudent = studentCoursesByStudentId.get(student.getId());
        if (studentCoursesByStudent != null) {
            for (StudentCourse studentCourseByStudent : studentCoursesByStudent) {
                StudentCourse studentCourse = new StudentCourse();
                studentCourse.setStudent(student);
                studentCourse.setCourse(studentCourseByStudent.getCourse());
                studentCourses.add(studentCourse);
            }
        }
    }
    return studentCourses;
}

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findStudentWithHighestGpa();
    }

    public String joinStudentNames() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}

