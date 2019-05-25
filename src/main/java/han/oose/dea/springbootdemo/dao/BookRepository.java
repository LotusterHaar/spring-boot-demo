package han.oose.dea.springbootdemo.dao;

import han.oose.dea.springbootdemo.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}