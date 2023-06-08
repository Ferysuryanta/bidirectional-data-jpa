package greenwood.jpa.api.service;

import greenwood.jpa.api.domain.Author;
import greenwood.jpa.api.domain.Zipcode;
import greenwood.jpa.api.dto.requestDto.AuthorRequestDto;
import greenwood.jpa.api.dto.responseDto.AuthorResponseDto;
import greenwood.jpa.api.dto.responseDto.PaginationResponse;
import greenwood.jpa.api.mapper.AuthorMapper;
import greenwood.jpa.api.repo.AuthorRepo;
import greenwood.jpa.api.repo.ZipcodeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private ZipcodeService zipcodeService;

    @Autowired
    private AuthorMapper authorMapper;


    @Override
    public AuthorResponseDto addAuthor ( AuthorRequestDto authorRequestDto ) {
        Author author = new Author ();
        author.setName ( authorRequestDto.getName ());
        if (authorRequestDto.getZipcodeId () == null) {
            throw new IllegalArgumentException ("Author need a zipcode");
        }
        Zipcode zipcode = zipcodeService.getZipcode (authorRequestDto.getZipcodeId());
        author.setZipcode ( zipcode );
        authorRepo.save ( author );
        return authorMapper.toDto (author);
    }

    @Override
    public List<AuthorResponseDto> getAuthors () {
        return null;
    }

    @Override
    public AuthorResponseDto getAuthorById ( Long authorId ) {
        return null;
    }

    @Override
    public Author getAuthor ( Long authorId ) {
        return null;
    }

    @Override
    public AuthorResponseDto deleteAuthor ( Long authorId ) {
        return null;
    }

    @Override
    public AuthorResponseDto editAuthor ( Long authorId, AuthorRequestDto authorRequestDto ) {
        return null;
    }

    @Override
    public AuthorResponseDto addZipcodeToAuthor ( Long authorId, Long zipcodeId ) {
        return null;
    }

    @Override
    public AuthorResponseDto deleteZipcodeFromAuthor ( Long authorId ) {
        return null;
    }

    @Override
    public PaginationResponse getListAuthors ( Integer totalPage, Integer pageSize, String sortBy, String sortOrder ) {
        return null;
    }
}
