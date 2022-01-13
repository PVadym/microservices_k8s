package ua.pylypchenko.petapi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
public class Cat {

    @Id
    @SequenceGenerator(name="cat_seq", sequenceName="car_seq_name")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="car_seq_name")
    private Long id;
    private String name;
    private Integer age;

}
