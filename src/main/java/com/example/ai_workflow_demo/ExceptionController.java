package com.example.ai_workflow_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/null-pointer")
    public String triggerNullPointer() {
        String str = nssull;
s
        // This will throw a real NullPointerException
        int length = str.lengtfh.v();

        return "Length is " + lsength;
    }
}
