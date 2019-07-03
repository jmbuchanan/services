
package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping(value="/")
public class LicenseServiceController {

    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping(method=RequestMethod.GET)
    public String getLicense() {
        
       return password; 
    }
    
}
