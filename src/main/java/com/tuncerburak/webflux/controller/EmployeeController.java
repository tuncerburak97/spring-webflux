package com.tuncerburak.webflux.controller;


import com.tuncerburak.webflux.entity.Employee;
import com.tuncerburak.webflux.repository.EmployeeRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping("/greeting")
    public String message(){
        return "First Deploy Message";
    }

    @GetMapping("/find/{id}")
    public Mono<Employee> getById(@PathVariable String id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/findAll")
    public Flux<Employee> findAll(){
        return employeeRepository.findAll();
    }


}
