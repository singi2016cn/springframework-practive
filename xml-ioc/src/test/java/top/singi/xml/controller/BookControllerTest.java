package top.singi.xml.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.singi.xml.entity.Book;

public class BookControllerTest {
    @Test
    public void showTest() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BookController bean = classPathXmlApplicationContext.getBean("bookController", BookController.class);
        Book show = bean.show(3L);
        System.out.println(show);
        classPathXmlApplicationContext.close();
    }
}
