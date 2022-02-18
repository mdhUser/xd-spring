package net.xdclass.sp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description: pzwj
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/17 23:01
 */
@Configuration
@PropertySource(value = {"classpath:config1.properties"})
public class CustomConfig {

    @Value("${server.host}")
    private String host;

    @Value("${server.port}")
    private int port;

    public int getPort() {
        return port;
    }

//    public void setPort(int port) {
//        this.port = port;
//    }

    public String getHost() {
        return host;
    }

//    public void setHost(String host) {
//        this.host = host;
//    }
}

