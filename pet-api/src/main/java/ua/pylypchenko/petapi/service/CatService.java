package ua.pylypchenko.petapi.service;

import ua.pylypchenko.petapi.protocol.CatCreateRequest;
import ua.pylypchenko.petapi.protocol.CatDto;

import java.util.List;

public interface CatService {

    List<CatDto> getAll();

    CatDto getById(Long id);

    Long createCat(CatCreateRequest request);

    void deleteCat(Long id);
}
