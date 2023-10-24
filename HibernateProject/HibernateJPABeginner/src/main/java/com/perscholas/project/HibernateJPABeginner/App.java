package com.perscholas.project.HibernateJPABeginner;

import com.perscholas.hib.controller.findUser_Hql;


public class App{
    public static void main( String[] args )
    {
        findUser_Hql u = new findUser_Hql();
        // using use the “From User” clause.
        //u.findUser();
        
        // using the “Select” clause
        u.findUserSelect();
        // using the “Where and Order by” clause 
        u.getRecordbyId();
        // get multiple columns
        u.getrecords();
        // executes a SELECT query that returns a single untyped result
        u.getmaxSalary();
        // use the Group By clause and “max()” function
        u.getmaxSalaryGroupBy();
        // Using Named Parameters Syntax
    	u.NamedQueryExample();
    }
}
