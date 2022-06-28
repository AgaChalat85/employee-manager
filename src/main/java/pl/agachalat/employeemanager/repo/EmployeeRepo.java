package pl.agachalat.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agachalat.employeemanager.domain.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {


    Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
