package greenwood.jpa.api.service;

import greenwood.jpa.api.domain.Author;
import greenwood.jpa.api.dto.requestDto.AuthorRequestDto;
import greenwood.jpa.api.dto.responseDto.AuthorResponseDto;
import greenwood.jpa.api.dto.responseDto.PaginationResponse;

import java.util.List;

public interface AuthorService {

    AuthorResponseDto addAuthor( AuthorRequestDto authorRequestDto );
    List<AuthorResponseDto> getAuthors();
    AuthorResponseDto getAuthorById(Long authorId);
    Author getAuthor(Long authorId);
    AuthorResponseDto deleteAuthor(Long authorId);
    AuthorResponseDto editAuthor(Long authorId, AuthorRequestDto authorRequestDto);
    AuthorResponseDto addZipcodeToAuthor(Long authorId, Long zipcodeId);
    AuthorResponseDto deleteZipcodeFromAuthor(Long authorId);
    PaginationResponse getListAuthors(Integer totalPage, Integer pageSize, String sortBy, String sortOrder);
}
