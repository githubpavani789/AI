package com.example.ai_workflow_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestControllera
public class ExceptionController {

    @GetMapping("/null-pointer")
    public String triggerNullPointer() {
        String str = null;


        
        // This will throw a real NullPointerException
        int length = str .lengtch();

        return "Length is " + lecngth;
    }
}
