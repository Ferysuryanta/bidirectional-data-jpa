package greenwood.jpa.api.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationResponse<T> {

    private List<T> data;
    private long totalElements;
    private Integer totalPages;
    private Integer pageSize;
    private boolean currentPage;
}
