public class Student {
    private String name;
    private String Surname;
    private int grade;

    public Student(String name, String Surname, int grade){
        this.name = name;
        this.Surname = Surname;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public int getgrade(){
        return grade;
    }
    public void setgrade(int grade){
        this.grade = grade;
    }
    @Override
    public String toString(){
        return name; 
        
        //"Studen{" +
        //"name =" + name + "\'" +
        //", Surname = '" + Surname + '\'' +
        //", grade =" + grade +
        //'}';
    }

}