package tr.edu.maltepe.oop;

public class Student extends User{
    public Student(int id, String name, String surName, String letterGrade) {
        super(id, name, surName);
        this.letterGrade = letterGrade;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    private String letterGrade;
    public Student(int id, String name, String surName) {
        super(id, name, surName);
    }
}
