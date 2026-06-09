package hellospringboot.session13.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private Long id;

    private String fullName;

    private Double salary;
}