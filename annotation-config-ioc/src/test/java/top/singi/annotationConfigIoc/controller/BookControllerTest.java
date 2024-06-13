package top.singi.annotationConfigIoc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import top.singi.annotationConfigIoc.config.AppAutoConfig;

public class BookControllerTest {
    @Test
    void testShow() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
                AppAutoConfig.class);
        BookController bean = annotationConfigApplicationContext.getBean(BookController.class);
        System.out.println("bean.show(6L) = " + bean.show(6L));
        annotationConfigApplicationContext.close();
    }
}
