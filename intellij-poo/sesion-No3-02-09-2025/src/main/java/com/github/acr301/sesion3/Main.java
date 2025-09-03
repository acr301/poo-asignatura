package com.github.acr301.sesion3;
import com.github.acr301.sesion3.models.Student;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameLowerCaseNoSpaces("s u per califra GILISTICO espi a li doso ");
        System.out.println(student.getName());

        student.setId("123");
        System.out.println(student.getId());

        Student student2 = new Student();
        student2.setId("12345678");
        System.out.println(student2.getId());
    }
}
