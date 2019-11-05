package com.codeyz.kernel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BotApiController {

    @RequestMapping(value = "/api/", method = RequestMethod.GET)
    public void listner() {
        System.out.println("This is get!");
    }

    @RequestMapping(value = "/api/", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public void listener(@RequestBody String payload) {
        System.out.println("TEST POST!!!");
        System.out.println(payload);
    }
}
