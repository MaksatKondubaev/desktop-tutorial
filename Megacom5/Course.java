import java.util.List;
import java.util.jar.Attributes.Name;

public class Course {
    private String name;
    private List<Student> studentList;
    private CourseType courseType;

    public Course (String name, List<Student> studentList, CourseType courseType) {
        this.name = name;
        this.studentList = studentList;
        this.courseType = courseType;
        //public Course
    }
    public Course() {
    }
    //public Course() {
    //}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  List<Student> getstudentList(){
        return studentList;
    }
    public void setstudentList(List<Student> studentList){
        this.studentList = studentList;
    }
    public CourseType getcourseType(){
        return courseType;
    }
    public void setCourseType(CourseType CourseType){
        this.courseType = courseType;
    }
    public void setStudentList(List<Student> javastudentList) {
    }
}