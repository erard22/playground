package ch.erard22.playground.deltaspikedata.repository;

import ch.erard22.playground.deltaspikedata.bo.Company;
import ch.erard22.playground.deltaspikedata.bo.Employee;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends EntityRepository<Employee, Long> {


    List<Employee> findByCompany(Company c);

    List<Employee> findBySalaryGreaterThanEquals(int minimumSalary);

}