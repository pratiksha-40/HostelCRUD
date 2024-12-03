package hostelproject.demohostel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import hostelproject.demohostel.entity.student;
import hostelproject.demohostel.repository.student_repository;

@Service
public class student_service {
   @Autowired
    private student_repository sr;

    public List<student> getallstudents(){
        return sr.findAll();
    }

    public String Createstudent(student student){
       
    sr.save(student);
    return "successfully add";
    }

    public String deletestudent(student student){
        sr.delete(student);
        return " delete student";
    }
    
    public student updateStudent(student s) {
        return sr.save(s);
    }
}
