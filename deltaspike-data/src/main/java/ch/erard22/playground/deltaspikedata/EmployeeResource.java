package ch.erard22.playground.deltaspikedata;

import ch.erard22.playground.deltaspikedata.bo.Company;
import ch.erard22.playground.deltaspikedata.bo.Employee;
import ch.erard22.playground.deltaspikedata.repository.CompanyRepository;
import ch.erard22.playground.deltaspikedata.repository.EmployeeRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.Collections;
import java.util.List;

/**
 * Created by michel on 26.10.15.
 */
@Path("/employees")
@Produces("application/json")
public class EmployeeResource {

    @Inject
    private EmployeeRepository employeeRepository;

    @Inject
    private CompanyRepository companyRepository;


    @GET
    @Path("/")
    public List<Employee> get() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Employee getById(@PathParam("id")long id) {
        return employeeRepository.findBy(id);
    }

    @GET
    @Path("/company/{companyId}")
    public List<Employee> getByCompany(@PathParam("companyId") long companyId) {
        Company company = companyRepository.findBy(companyId);
        List<Employee> list = Collections.emptyList();
        if (company != null) {
            list = employeeRepository.findByCompany(company);
        }
        return list;
    }

    @GET
    @Path("/topearners")
    public List<Employee> getbySalary(@QueryParam("minimumSalary") int minimumSalary) {
        return employeeRepository.findBySalaryGreaterThanEquals(minimumSalary);
    }

}
