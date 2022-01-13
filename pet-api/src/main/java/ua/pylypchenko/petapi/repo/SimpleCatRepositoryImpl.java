package ua.pylypchenko.petapi.repo;

import org.springframework.stereotype.Repository;
import ua.pylypchenko.petapi.entity.Cat;
import ua.pylypchenko.petapi.protocol.CatCreateRequest;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class SimpleCatRepositoryImpl implements CatRepository{

    private final List<Cat> storage = new CopyOnWriteArrayList<>();

    @Override
    public List<Cat> getAll() {
        return storage;
    }

    @Override
    public Optional<Cat> getById(Long id) {
       return storage.stream()
               .filter(c-> c.getId().equals(id))
               .findFirst();
    }

    @Override
    public Long create(CatCreateRequest request) {
        Cat cat = new Cat();
        cat.setId(storage.size()+1L);
        cat.setAge(request.getAge());
        cat.setName(request.getName());
        storage.add(cat);
        return cat.getId();
    }

    @Override
    public void deleteById(Long id) {
        storage.removeIf(c -> c.getId().equals(id));
    }
}
