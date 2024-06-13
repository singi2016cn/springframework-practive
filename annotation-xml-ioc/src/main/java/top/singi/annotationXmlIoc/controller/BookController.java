package top.singi.annotationXmlIoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import top.singi.annotationXmlIoc.entity.Book;
import top.singi.annotationXmlIoc.service.BookService;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    public Book show(Long id) {
        return bookService.getBookById(id);
    }
}
