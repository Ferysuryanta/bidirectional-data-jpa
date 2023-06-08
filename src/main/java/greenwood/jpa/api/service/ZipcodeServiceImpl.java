package greenwood.jpa.api.service;

import greenwood.jpa.api.domain.Zipcode;
import greenwood.jpa.api.dto.requestDto.ZipcodeRequestDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZipcodeServiceImpl implements ZipcodeService{
    @Override
    public Zipcode addZipcode ( ZipcodeRequestDto zipcodeRequestDto ) {
        return null;
    }

    @Override
    public List<Zipcode> getZipcodes () {
        return null;
    }

    @Override
    public Zipcode getZipcode ( Long zipcodeId ) {
        return null;
    }
}
