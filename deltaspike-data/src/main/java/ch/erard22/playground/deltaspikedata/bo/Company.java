package ch.erard22.playground.deltaspikedata.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by michel on 26.10.15.
 */
@Entity
public class Company {

    @Id
    @GeneratedValue
    private long id;

    private String name;


    public Company() {}

    public Company(String name) {
        this.name = name;
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

}
