package top.singi.aop;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {
    public Integer add(Integer a, Integer b);
}
