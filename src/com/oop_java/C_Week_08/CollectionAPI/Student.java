package com.oop_java.C_Week_08.CollectionAPI;

import java.util.Comparator;

public class Student  implements Comparator<Student>{
    String name;
    String regNo;

    public Student(String name, String regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo='" + regNo + '\'' +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {

        return o1.name.compareTo(o2.name);
    }

    @Override
    public boolean equals(Object o){
        Student st=(Student) o;
        return this.name.equals(st.name);
    }
}
