## Deltaspike Data Playground

###Introduction
Less code means faster in development, less tests to write and less errors in production. This playground shall show how
[apache deltaspike-data](https://deltaspike.apache.org/documentation/data.html) can help by making dao classes useless in all common use cases.

This simple application has already quite a lot of database access without any line code by just defining an interface.

And I know, it is not proper REST what I do here, but good enough for this small example.

###Start the application
The application is built with [jboss wildfly-swarm](http://wildfly.org/swarm/). Simply type 
`mvn wildfly-swarm:run`
and wildfly is getting started listening on port 8080.

###functions
you can use the following rest calls to filter the results: 

<table>
    <tr>
        <td>list all employees</td>
        <td>`http://localhost:8080/demo/employees/`</td>
    </tr>
    <tr>
        <td>show one specific employee</td>
        <td>`http://localhost:8080/demo/employees/{id}`</td>
    </tr>
    <tr>
        <td>show all employees of a specific company</td>
        <td>`http://localhost:8080/demo/employees/company/{companyId}`</td>
    </tr>
    <tr>
        <td>show all employees above a given salary</td>
        <td>`http://localhost:8080/demo/employees/topearners?minimumSalary={minimumSalary}`</td>
    </tr>
</table>