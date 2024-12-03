package hostelproject.demohostel.services;

import java.util.List;

import hostelproject.demohostel.entity.Wings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hostelproject.demohostel.repository.wings_repository;

@Service
public class wings_service {
@Autowired
private wings_repository wr;


    public List<Wings> getallwings(){
        return wr.findAll();
    }

    public String Createwings(Wings wing){
        wr.save(wing);
        return "wings added succsefully!";
    }
    public String deletewings(Wings wing){
        wr.delete(wing);
        return "delete wing successfully";
    }

    public Wings update(Wings wings){
       return wr.save(wings);


    } 

}
