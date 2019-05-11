package han.oose.dea.springbootdemo.persistence.repo;

import han.oose.dea.springbootdemo.persistence.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}