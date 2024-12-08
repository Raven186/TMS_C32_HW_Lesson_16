package service;

import model.Student;

import java.util.*;

public class PassportAndStudentMapper {
    private Set<String> passportNumbers = new HashSet<>();
    private Set<Student> students = new HashSet<>();
    private Map<String, Student> passportToStudentMap = new HashMap<>();

    public void addPassport(String passportNumber) {
        passportNumbers.add(passportNumber);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void mapPassportsToStudents() {
        if (passportNumbers.size() != students.size()) {
            throw new IllegalArgumentException("Количество паспортов и студентов должно совпадать.");
        }

        Iterator<String> passportIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();

        while (passportIterator.hasNext() && studentIterator.hasNext()) {
            passportToStudentMap.put(passportIterator.next(), studentIterator.next());
        }
    }

    public void printPassportToStudentMap() {
        System.out.println("Коллекция паспортов и студентов:");
        for (Map.Entry<String, Student> entry : passportToStudentMap.entrySet()) {
            System.out.println("Паспорт: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
