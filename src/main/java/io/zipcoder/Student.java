package io.zipcoder;

import java.util.ArrayList;

public class Student {
    // instance variables

    private String firstname;
    private String lastname;

    private ArrayList<Double> examScores;



    public Student(String firstname, String lastname, ArrayList<Double> examScores) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.examScores = examScores;
    }


    public String getFirstname() {
        return this.firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getExamScore() {

    }

    public double getNumberOfTestsTaken() {
        // count indexes of exams taken for student
        //ArrayList<Double>
    }

    public String getExamScores() {
        String returnExamScores = "";
        for( int i = 0; i <examScores.size(); i++) {
            returnExamScores += "\n" + examScores;
        }
        return returnExamScores;
    }

    public void addExamScore(double examScore) {
    }
}
