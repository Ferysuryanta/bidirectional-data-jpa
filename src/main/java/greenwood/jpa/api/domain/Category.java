package greenwood.jpa.api.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Book> books = new ArrayList<> ();

    public Category ( Long id, String name, List<Book> books ) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {
        books.add ( book );
    }

    public void deleteBook(Book book) {
        books.remove ( book );
    }
}
