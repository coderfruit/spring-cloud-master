package org.yangdongdong.springcloud.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yangdongdong.springcloud.service.HelloService;

@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hystrix-hello", method = RequestMethod.GET)
    public String hello() {
        return helloService.callHello();
    }

    @RequestMapping(value = "/hystrix-handler", method = RequestMethod.GET)
    public String handler() {
        return helloService.handler();
    }

    @RequestMapping(value = "/hystrix-hi", method = RequestMethod.GET)
    public String hi(String name) {
        return helloService.callHi(name);
    }

    @RequestMapping(value = "/hystrix-request", method = RequestMethod.GET)
    public String request() {
        return helloService.callRequest();
    }

    @RequestMapping(value = "/hystrix-circuit-breaker", method = RequestMethod.GET)
    public String circuitBreaker() {
        return helloService.callCircuitBreaker();
    }

}
