package hostelproject.demohostel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hostelproject.demohostel.services.wings_service;

@RestController
@RequestMapping("welcome")
public class welcome_controller {
  @Autowired
private wings_service ws;

    
    
}
