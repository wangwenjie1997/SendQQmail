package com.wwj.mailactivation.Controller;

import com.wwj.mailactivation.Service.SendQQMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class SendQQMailController {

    @Autowired
    private SendQQMailService sendQQMailService;

    @RequestMapping("/sendQQMail")
    public String send(String sender,String receiver,String title,String text){
        log.info("SendQQMailController-->sender: "+sender+",receiver: "+receiver+",title: "+title+",text: "+text);
        sendQQMailService.send(sender,receiver,title,text);
        return "sendsuccess";
    }

    @RequestMapping("/start")
    public String start(){
        return "index";
    }

}
