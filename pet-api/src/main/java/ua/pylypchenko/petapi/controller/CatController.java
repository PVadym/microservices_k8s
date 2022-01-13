package ua.pylypchenko.petapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.pylypchenko.petapi.protocol.CatCreateRequest;
import ua.pylypchenko.petapi.protocol.CatDto;
import ua.pylypchenko.petapi.service.CatService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {

    private final CatService catService;

    @GetMapping
    public ResponseEntity<List<CatDto>> getAll(){
        return ResponseEntity.ok(catService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CatDto> getCatById(@PathVariable Long id){
        return ResponseEntity.ok(catService.getById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteCat(@PathVariable Long id){
        catService.deleteCat(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping
    public ResponseEntity<Long> createCat(@RequestBody CatCreateRequest request){
        return ResponseEntity.ok(catService.createCat(request));
    }

}
