package tr.edu.maltepe.oop;

public class Professor extends User{
    public Professor(int id, String name, String surName, int classCode) {
        super(id, name, surName);
        this.classCode = classCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    private int classCode;
    public Professor(int id, String name, String surName) {
        super(id, name, surName);

    }
}