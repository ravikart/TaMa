package org.tama.todo.controller.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
	
}
