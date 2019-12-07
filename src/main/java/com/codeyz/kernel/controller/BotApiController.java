package com.codeyz.kernel.controller;

import com.codeyz.kernel.CentralExecutor;
import com.codeyz.kernel.UpdateHandler;
import com.codeyz.operation.ActionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class BotApiController {

    @Autowired
    private ApplicationContext context;

    @RequestMapping(value = "/api/", method = RequestMethod.GET)
    public void listner() {
    }

    @RequestMapping(value = "/api/", method = RequestMethod.POST, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public void listener(@RequestBody String payload) {
        ActionHandler actionHandler = context.getBean(ActionHandler.class);
        CentralExecutor.exec.submit(new UpdateHandler(payload, actionHandler));
    }
}
