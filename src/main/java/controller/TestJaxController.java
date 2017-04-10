/**
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package controller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @Title:
 * @Description: (描述此类的功能)
 * @author lsm
 * @date 2017-04-02 22:19
 */
@WebService
public interface TestJaxController {
   @WebMethod
   Integer add(@WebParam(name = "a")int a,@WebParam(name = "b") int b);
   @WebMethod
   Integer min(int a,int b);
}
