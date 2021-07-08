package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.service.MsgService;

@RestController
public class rest1_controller {

    @Autowired
    private MsgService msgService;

    @GetMapping("/")
    @ResponseBody
    String msg_all(){

        return msgService.msg_all().toString();
    }

}
