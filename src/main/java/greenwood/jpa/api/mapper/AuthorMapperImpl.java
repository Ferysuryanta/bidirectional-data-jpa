package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Author;
import greenwood.jpa.api.domain.Book;
import greenwood.jpa.api.domain.Zipcode;
import greenwood.jpa.api.dto.responseDto.AuthorResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorMapperImpl implements AuthorMapper{


    @Override
    public AuthorResponseDto toDto ( Author author ) {
        AuthorResponseDto authorResponseDto = new AuthorResponseDto ();
        authorResponseDto.setId ( author.getId () );
        authorResponseDto.setName ( author.getName () );
        List<String> names = new ArrayList<> ();
        List<Book> books = author.getBooks ();
        for (Book book : books) {
            names.add ( book.getName ());
        }
        authorResponseDto.setBookNames ( names );
        return authorResponseDto;
    }

    @Override
    public List<AuthorResponseDto> getListAuthor ( List<Author> authors ) {
        List<AuthorResponseDto> responseDtoList = new ArrayList<> ();
        for (Author author : authors) {
            AuthorResponseDto responseDto = toDto ( author );
            responseDtoList.add ( responseDto );
        }
        return responseDtoList;
    }
}
