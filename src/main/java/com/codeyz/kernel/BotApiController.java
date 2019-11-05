package com.codeyz.kernel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BotApiController {

    @RequestMapping(value = "/api/", method = RequestMethod.GET)
    public void listner() {
    }

    @RequestMapping(value = "/api/", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public void listener(@RequestBody String payload) {
        CentralExecutor.exec.submit(new UpdateHandler(payload));
    }
}
