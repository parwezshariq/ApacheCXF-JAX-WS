package com.shariqparwez.cxfdemo;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

