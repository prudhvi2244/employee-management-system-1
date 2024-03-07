package com.example.employeemanagementsystem1.repisitory;

import com.example.employeemanagementsystem1.entity.Employee;
import com.example.employeemanagementsystem1.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee(){

        Employee savedEmployee=employeeRepository.save(Employee.builder()
                .ecity("Goa")
                .ename("Praveen")
                .email("praveen@gmail.com")
                .build());
        Assertions.assertThat(savedEmployee).isNotNull();


    }



}
