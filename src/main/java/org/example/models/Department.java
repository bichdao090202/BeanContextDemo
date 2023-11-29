package org.example.models;

public class Department {
    private String d_name;
    private Faculty faculty;

    public Department() {
    }

    public Department(String d_name, Faculty faculty) {
        this.d_name = d_name;
        this.faculty = faculty;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_name='" + d_name + '\'' +
                ", faculty=" + faculty +
                '}';
    }

}
