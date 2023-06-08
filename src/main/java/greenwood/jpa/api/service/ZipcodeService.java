package greenwood.jpa.api.service;

import greenwood.jpa.api.domain.Zipcode;
import greenwood.jpa.api.dto.requestDto.ZipcodeRequestDto;

import java.util.List;

public interface ZipcodeService {

    Zipcode addZipcode( ZipcodeRequestDto zipcodeRequestDto );
    List<Zipcode> getZipcodes();
    Zipcode getZipcode(Long zipcodeId);
}
