package ua.pylypchenko.petapi.repo;

import ua.pylypchenko.petapi.entity.Cat;
import ua.pylypchenko.petapi.protocol.CatCreateRequest;

import java.util.List;
import java.util.Optional;

public interface CatRepository {

    List<Cat> getAll();

    Optional<Cat> getById(Long id);

    Long create(CatCreateRequest request);

    void deleteById(Long id);

}
