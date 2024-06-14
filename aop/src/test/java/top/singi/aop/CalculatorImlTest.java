package top.singi.aop;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class CalculatorImlTest {

    @Autowired
    Calculator calculator;

    @Test
    void testAdd() {
        Integer integer = calculator.add(1, 2);
        LoggerFactory.getLogger(getClass()).info(integer + "");
    }
}
