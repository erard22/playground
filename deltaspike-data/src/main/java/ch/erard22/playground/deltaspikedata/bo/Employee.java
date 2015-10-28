package ch.erard22.playground.deltaspikedata.bo;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by michel on 26.10.15.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String firstname;

    private int salary;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="COMPANY_ID")
    private Company company;

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
