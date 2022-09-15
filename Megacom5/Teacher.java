import java.util.List;

public class Teacher {
    private String name;
    private String surName;
    private Course course;
    
    public Teacher (String name, String surName, Course course){
        this.name = name;
        this.surName = surName;
        this.course = course;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getsurName(){
        return surName;
    }
    public void setsurName(String surName){
        this.surName = surName;
    }
    public String getcourse(){
        return name;
    }
    public void setcourse(Course course){
        this.course = course;
    }
}

