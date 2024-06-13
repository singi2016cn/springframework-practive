package top.singi.annotationXmlIoc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookControllerTest {
    @Test
    void testShow() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BookController bookContrller = applicationContext.getBean("bookController", BookController.class);
        System.out.println(bookContrller.show(9L));

        applicationContext.close();
    }
}
