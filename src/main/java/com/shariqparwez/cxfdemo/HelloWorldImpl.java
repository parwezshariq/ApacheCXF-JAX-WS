
package com.shariqparwez.cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.shariqparwez.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

