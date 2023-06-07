package greenwood.jpa.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "zipcode_id")
    private Zipcode zipcode;

    @ManyToMany
    private List<Book> books = new ArrayList<> ();

    public Author ( Long id, String name, Zipcode zipcode, List<Book> books ) {
        this.id = id;
        this.name = name;
        this.zipcode = zipcode;
        this.books = books;
    }
}
