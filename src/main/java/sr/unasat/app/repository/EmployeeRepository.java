package sr.unasat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sr.unasat.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
