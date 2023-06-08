package greenwood.jpa.api.mapper;

import greenwood.jpa.api.domain.Category;
import greenwood.jpa.api.dto.responseDto.CategoryResponseDto;

import java.util.List;

public interface CategoryMapper {

    CategoryResponseDto toDto( Category category );

    List<CategoryResponseDto> listCategory(List<Category> categories);
}
