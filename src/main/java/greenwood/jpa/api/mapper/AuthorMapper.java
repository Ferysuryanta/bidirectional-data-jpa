package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Author;
import greenwood.jpa.api.dto.responseDto.AuthorResponseDto;

import java.util.List;

public interface AuthorMapper {

    AuthorResponseDto toDto( Author author );
    List<AuthorResponseDto> getListAuthor(List<Author> authors);
}
