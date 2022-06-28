package pl.agachalat.employeemanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.agachalat.employeemanager.domain.Employee;
import pl.agachalat.employeemanager.exception.UserNotFoundException;
import pl.agachalat.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(UserNotFoundException::new);

    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
