package com.shailendra.bookmanagement.Controller;

import com.shailendra.bookmanagement.Entity.Book;
import com.shailendra.bookmanagement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/HereIsYourBook")
public class BookController {


    private final BookService bookService ;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book saveBook = bookService.addBook(book);
        return ResponseEntity.ok(saveBook);
    }

@GetMapping("/getBook/{bookByName}")
public ResponseEntity<Book> addBook(@PathVariable("bookName")String name) {
    Book bookByName = bookService.getBookByName(name);
    return ResponseEntity.ok(bookByName);

}

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@PathVariable Book book){
        Book updateBookbook = bookService.updateBook(book);
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping ("/deleteBook/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable ("id") Integer id ) {
      bookService.deleteBook(id);
        return ResponseEntity.notFound().build();
    }

}

