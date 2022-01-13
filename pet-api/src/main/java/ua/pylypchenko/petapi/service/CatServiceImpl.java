package ua.pylypchenko.petapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.pylypchenko.petapi.entity.Cat;
import ua.pylypchenko.petapi.protocol.CatCreateRequest;
import ua.pylypchenko.petapi.protocol.CatDto;
import ua.pylypchenko.petapi.repo.CatRepository;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class CatServiceImpl implements CatService{

    private final CatRepository catRepository;

    @Override
    public List<CatDto> getAll() {
        return catRepository.findAll().stream()
                .map(c -> new CatDto(c.getName(), c.getAge()))
                .collect(toList());
    }

    @Override
    public CatDto getById(Long id) {
        return catRepository.findById(id)
                .map(c -> new CatDto(c.getName(), c.getAge()))
                .orElse(null);
    }

    @Override
    public Long createCat(CatCreateRequest request) {
        Cat cat  = catRepository.save(new Cat()
                .setAge(request.getAge())
                .setName(request.getName()));

        return cat.getId();
    }

    @Override
    public void deleteCat(Long id) {
        catRepository.deleteById(id);
    }
}
