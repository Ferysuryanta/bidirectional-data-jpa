package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Book;
import greenwood.jpa.api.dto.responseDto.BookResponseDto;

import java.util.List;

public interface BookMapper {

    BookResponseDto toDto ( Book book);

    List<BookResponseDto> bookResponseDtoList( List<Book> books);
}
