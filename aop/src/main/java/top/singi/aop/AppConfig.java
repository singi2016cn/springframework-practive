package top.singi.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  //开启aspctj自动代理
@ComponentScan("top.singi.aop")
public class AppConfig {
    
}
