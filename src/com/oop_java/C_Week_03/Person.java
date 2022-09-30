package com.oop_java.C_Week_03;

import com.oop_java.C_Week02.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Date dob;

    public Person(String firstName,String lastName, Date dob){
        setFirstName(firstName);
        //this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName!=null)
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String toString(){
        return firstName+" "+lastName+"  Dob:"+dob;
    }
}
