import model.Student;
import service.PassportAndStudentMapper;

public class Main {
    public static void main(String[] args) {
        PassportAndStudentMapper mapper = new PassportAndStudentMapper();

        // Добавляем уникальные номера паспортов
        mapper.addPassport("AA123456");
        mapper.addPassport("BB654321");
        mapper.addPassport("CC112233");

        // Добавляем уникальных студентов
        mapper.addStudent(new Student("Иван Иванов", 20));
        mapper.addStudent(new Student("Мария Смирнова", 19));
        mapper.addStudent(new Student("Петр Петров", 21));

        // Создаем сопоставление и выводим результат
        try {
            mapper.mapPassportsToStudents();
            mapper.printPassportToStudentMap();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
