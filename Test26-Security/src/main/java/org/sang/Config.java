package org.sang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Administrator on 2017/6/30.
 */
@Configuration
@EnableRedisHttpSession
public class Config {
    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.port}")
    private int port;

    @Bean
    public JedisConnectionFactory connectionFactory() {
       JedisConnectionFactory connectionFactory=new JedisConnectionFactory();
        System.out.print(host);
        System.out.print(password);
        System.out.print(port+"-----------------------------------");
        connectionFactory.setHostName(host);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }
}
