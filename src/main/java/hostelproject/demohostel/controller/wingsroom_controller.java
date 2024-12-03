package hostelproject.demohostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hostelproject.demohostel.services.wingsroom_service;
import hostelproject.demohostel.entity.WingRoom;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/wingsroom")
public class wingsroom_controller {
    @Autowired

    private wingsroom_service wrs;

    @GetMapping("getwingroom")
    public List<WingRoom> getMethodName() {
        return wrs.getallwingRoom();
    }

    @PostMapping("addwingroom")
    public String postMethodName(@RequestBody WingRoom wingRoom) {
      
        
        return wrs.CreateWingsRoom(wingRoom);
    }
    
@DeleteMapping("deletewingroom")
public String deletewingrooms(@RequestBody WingRoom wingRoom){
    return "deleted " +wrs.deletewingroom(wingRoom);
}

@PutMapping("updatewingroom")
public String putMethodName( @RequestBody WingRoom wingRoom) {
    
    
    return "updated"+ wrs.updatewingroom(wingRoom);
}
    
    
    
}
