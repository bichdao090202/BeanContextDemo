package org.example.models;

public class Lop {
    private String classId;
    private String className;

    public Lop() {
    }

    public Lop(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

}
