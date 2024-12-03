package hostelproject.demohostel.controller;

import java.util.List;
import hostelproject.demohostel.entity.Wings;
import hostelproject.demohostel.entity.student;
import hostelproject.demohostel.services.wings_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/wings")
public class wings_controller {
     @Autowired
     private wings_service ws;

     @GetMapping("wings")
     public List<Wings> getMethodName() {
         return ws.getallwings();
     }
     
     @PostMapping("addwings")
     public String postMethodName(@RequestBody Wings wing) {
         
        
         return ws.Createwings(wing);
     }
     
        
   @DeleteMapping("delete")
public String deleteStudent(@RequestBody Wings wings) {
    ws.deletewings(wings); 
    return "Student deleted successfully";
    
}
    @PutMapping("updatewing")
    public String updatewing(@RequestBody Wings wing){

        return "updated wing"+ ws.update(wing) ;
    }

}
