package com.wwj.mailactivation.Service;

import com.wwj.mailactivation.Util.SendQQMailUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendQQMailService {

    @Autowired
    private SendQQMailUtil sendQQMailUtil;

    public void send(String sender,String receiver,String title,String text){
        log.info("SendQQMailService-->sender: "+sender+",receiver: "+receiver+",title: "+title+",text: "+text);
        sendQQMailUtil.send(sender,receiver,title,text);
    }

}
