/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */

import controller.TestJaxController;
import controller.TestJaxControllerImpl;
import org.junit.Test;

import javax.xml.ws.Endpoint;

/**
 * @Title:
 * @Description: (描述此类的功能)
 * @author lsm
 * @date 2017-04-02 22:23
 */
public class TestJaxService {

    public static  void  main(String [] args){
        Endpoint.publish("http://localhost:1234/testjax", new TestJaxControllerImpl());
        System.out.println("发布成功");
    }
}
