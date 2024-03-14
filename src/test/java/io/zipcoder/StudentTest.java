package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

@Test
    public void testGetFirstname() {

    }
@Test
    public void testSetFirstname() {
    }
@Test
    public void testGetLastname() {
    }
@Test
    public void testSetLastname() {
    }

 @Test
 public void testAddExamScore() {
    // : Given
     String firstName = "Leon";
     String lastName = "Hunter";
     ArrayList<Double> examScores = new ArrayList<>();
     Student student = new Student(firstName, lastName, examScores);

    // When
     String expectedExamScore = "Exam Scores: \n" + 100;
     student.addExamScore(100);
     String actualExamScore = student.getExamScores();

    // Then
     Assert.assertEquals(expectedExamScore, actualExamScore);

 }

 @Test
    public void testSetExamScore() {
     // : Given
     String firstName = "Leon";
     String lastName = "Hunter";
     ArrayList<Double> examScores = new ArrayList<>(List.of(100.0, 95.0, 123.0, 96.0));
     Student student = new Student(firstName, lastName, examScores);

     // When
     student.addExamScore(100.0);
     String output = student.getExamScores();

     // Then
     Assert.assertEquals(expectedExamsScores, actualExamScores);


 }

}