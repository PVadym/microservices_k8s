package ua.pylypchenko.petapi.protocol;

import lombok.Data;

@Data
public class CatCreateRequest {
    private String name;
    private Integer age;
}
