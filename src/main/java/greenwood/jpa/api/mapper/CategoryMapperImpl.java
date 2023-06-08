package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Book;
import greenwood.jpa.api.domain.Category;
import greenwood.jpa.api.dto.responseDto.CategoryResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryMapperImpl implements CategoryMapper{


    @Override
    public CategoryResponseDto toDto ( Category category ) {
        CategoryResponseDto categoryResponseDto = new CategoryResponseDto ();
        categoryResponseDto.setId ( category.getId ());
        categoryResponseDto.setName ( category.getName () );
        List<String> names = new ArrayList<> ();
        List<Book> books = category.getBooks ();

        for (Book book : books) {
            names.add ( book.getName ());
        }
        categoryResponseDto.setBookNames (names);
        return categoryResponseDto;
    }

    @Override
    public List<CategoryResponseDto> listCategory ( List<Category> categories ) {
        List<CategoryResponseDto> responseDtoList = new ArrayList<> ();
        for (Category category : categories) {
            CategoryResponseDto categoryResponseDto = toDto ( category );
            responseDtoList.add ( categoryResponseDto );
        }
        return responseDtoList;
    }
}
