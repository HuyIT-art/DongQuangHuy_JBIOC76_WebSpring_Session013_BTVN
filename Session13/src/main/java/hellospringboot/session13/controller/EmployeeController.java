package hellospringboot.session13.controller;


import hellospringboot.session13.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {


    @GetMapping
    public List<Employee> getEmployees(){

        return List.of(

                new Employee(
                        1L,
                        "Nguyen Van A",
                        1500.0
                ),

                new Employee(
                        2L,
                        "Tran Van B",
                        2000.0
                ),

                new Employee(
                        3L,
                        "Le Van C",
                        2500.0
                )

        );
    }
}