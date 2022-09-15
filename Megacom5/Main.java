import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Main{
    private static Scanner scanner = new Scanner(System.in);

    private static List<Student> studentList = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        printActions();
        int userAction = getUserAction();
        executeUserAction(userAction);
        List<Student> javastudentList = new ArrayList<>();
        Student student1 = new Student("Azat", "Azatov", 4);

        javastudentList.add(student1);

        javastudentList.add(new Student("Azhara", "Marsanova", 5));
        javastudentList.add(new Student("Adilet", "Maratov", 4));
        javastudentList.add(new Student("Azamat", "Sadyrov", 3));

        //Student student = new Student();
        Course javaLong = new Course();
        javaLong.setCourseType(CourseType.DEFAULT);
        javaLong.setName("java developer");
        javaLong.setStudentList(javastudentList);
        Teacher aziz = new Teacher( "Aziz", "Kondubaev", javaLong);

        List<Student> jsStudentList = new LinkedList<>();
        jsStudentList.add(new Student("Said", "Ruslanov", 5));
        jsStudentList.add(new Student("Ruslan", "Nurlanov", 5));
        jsStudentList.add(new Student("Olio", "Maksatova", 5));
        jsStudentList.add(new Student("Beksultan", "Sultanov", 5));
        jsStudentList.add(new Student("Altynai", "Zholomonova", 5));

        Course jsCourse = new Course ("JS developer", jsStudentList, CourseType.BOOT_CAMP);

        Teacher aibek = new Teacher("Aibek",  "Omarov", jsCourse);

        List<Teacher> itSchoolStuffList = new ArrayList<>();
        itSchoolStuffList.add(aziz);
        itSchoolStuffList.add(aibek);

        for(int i = 0; i < itSchoolStuffList.size(); i++ ){
            Teacher teacher = itSchoolStuffList.get(i);
            System.out.println("*****************************");
            System.out.println("Teacher:" + teacher.getName());
            System.out.println("Course name:" + teacher.getcourse().getName());
            System.out.println("Students:" + teacher.getcourse().getStudentList());
            System.out.println("Duration:" + teacher.getcourse().getCourseType().getDuration());
        }
    }

    public static void executeUserAction(int userAction){
        switch (userAction){
            case 1:
                addStudent();
            break;
            case 2:
                printStudents();
            break;
            default:
            System.out.println("Нет такого действия");
        }
    }
    public static void printStudents(){
        for(Student s:studentList){
            System.out.println(s);
        }
    }
    public static void addStudent(){
        System.out.println("Введите Имя");
        String name = scanner.next();

        System.out.println("Введите Фамилию");
        String surName = scanner.next();

        System.out.println("Введите оценку за полугодие");
        int grade = scanner.nextInt();

        Student student = new Student(name, surName, grade);

        studentList.add(student);

        System.out.println("Успешно добавлен");

        System.out.println("Хотите еще добавить студента?");
        String answer = scanner.next();

        if(answer.equalsIgnoreCase("да")){
            addStudent();
            return;
        }else{
            printStudents();
        }
    }


    public static void printActions(){
        System.out.println("Введите номер операции");
        System.out.println("1. Хочу добавить студентов" + 
        "2.Хочу посмотерть список студентов");
    }

    private static int getUserAction(){
        scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("");
            getUserAction();
        }
        System.out.println(scanner.hasNextInt());
        return scanner.nextInt();
    }
}