package ua.pylypchenko.petapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pylypchenko.petapi.entity.Cat;
import ua.pylypchenko.petapi.protocol.CatCreateRequest;

import java.util.List;
import java.util.Optional;

public interface CatRepository extends JpaRepository<Cat, Long> {

}
