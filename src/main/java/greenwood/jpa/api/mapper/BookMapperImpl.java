package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Author;
import greenwood.jpa.api.domain.Book;
import greenwood.jpa.api.dto.responseDto.BookResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookResponseDto toDto ( Book book ) {

        BookResponseDto dto = new BookResponseDto ();
        dto.setId ( book.getId ());
        dto.setCategoryName ( book.getCategory().getName());
        List<String> names = new ArrayList<> ();
        List<Author> authors = book.getAuthors ();
        for (Author author : authors) {
            names.add ( author.getName ());
        }
        dto.setAuthorNames ( names );
        return dto;
    }

    @Override
    public List<BookResponseDto> bookResponseDtoList( List<Book> books) {
        List<BookResponseDto> responseDtoList = new ArrayList<> ();
        for (Book book : books) {
            BookResponseDto responseDto = toDto ( book );
            responseDtoList.add(responseDto);
        }
        return responseDtoList;
    }
}
