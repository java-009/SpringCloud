package com.bcy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*进行替换ribbon的负载均衡策略*/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //使用随机策略
        return new RandomRule();
    }
}
