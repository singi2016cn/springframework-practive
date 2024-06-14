package top.singi.aop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorIml implements Calculator {

    @Override
    public Integer add(Integer a, Integer b) {
        var r = a + b;
        System.out.println("result:" + r);
        return r;
    }
}
