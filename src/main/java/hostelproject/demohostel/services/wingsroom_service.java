package hostelproject.demohostel.services;
import hostelproject.demohostel.entity.WingRoom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import hostelproject.demohostel.repository.wings_Room_repository;

@Service
public class wingsroom_service {
 @Autowired
private wings_Room_repository wrr;

public List<WingRoom> getallwingRoom(){
    return wrr.findAll();
}

public String CreateWingsRoom(WingRoom wingroom){
    wrr.save(wingroom);
    return "add wing room add successfully";
}

public String deletewingroom( WingRoom wingsRoom){
 wrr.delete(wingsRoom);
 return "deleted : wingroom";
}

public WingRoom updatewingroom(WingRoom wingRoom){
    return wrr.save(wingRoom);
}
}
