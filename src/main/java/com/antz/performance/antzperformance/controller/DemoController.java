package com.antz.performance.antzperformance.controller;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: antz-performance
 * @description:
 * @author: huanghuang@rewin.com.cn
 * @Create: 2019-04-21 17:34
 **/
@RestController
public class DemoController {

    private Logger log = LoggerFactory.getLogger(DemoController.class) ;

    //@Autowired
    Connector connector ;
    @GetMapping("/antz/demo/perform")
    public String perform(@RequestParam("param") String param){
        log.info("入参,{}",param);
        return param ;
    }

    @GetMapping("/antz/demo/tomcat")
    public String tomcat(){
        Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler() ;
        log.info("################################################################");
        log.info("Tomcat");
        log.info("PollerThreadCount:{}",protocol.getPollerThreadCount());
        log.info("AcceptCount:{}",protocol.getAcceptCount());
        log.info("AcceptorThreadCount:{}",protocol.getAcceptorThreadCount());
        log.info("MaxConnections:{}",protocol.getMaxConnections());
        log.info("MaxKeepAliveRequests:{}",protocol.getMaxKeepAliveRequests());
        log.info("MaxThreads:{}",protocol.getMaxThreads());
        log.info("AcceptCount:{}",protocol.getAcceptCount());
        log.info("ConnectionCount:{}",protocol.getConnectionCount());
        log.info("ConnectionTimeout:{}",protocol.getConnectionTimeout());
        log.info("################################################################");
        return "" ;
    }


}
