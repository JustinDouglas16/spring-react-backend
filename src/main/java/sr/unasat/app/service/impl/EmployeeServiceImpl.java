package sr.unasat.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sr.unasat.app.dto.EmployeeDto;
import sr.unasat.app.entity.Employee;
import sr.unasat.app.mapper.EmployeeMapper;
import sr.unasat.app.repository.EmployeeRepository;
import sr.unasat.app.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
