package ua.pylypchenko.petapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Cat {

    private Long id;
    private String name;
    private Integer age;

}
