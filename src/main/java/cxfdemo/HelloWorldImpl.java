
package cxfdemo;

import javax.jws.WebService;

@WebService(endpointInterface = "cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

