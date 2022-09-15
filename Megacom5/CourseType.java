import java.time.Month;

public enum CourseType {
    BOOT_CAMP ("3 month"),
    DEFAULT ("7 month");

    private String  duration;

    CourseType (String duration){
        this.duration = duration;
    }

    public String getDuration(){
        return duration;
    }

    //public void setDuration(String duration){
        //this.duration = duration;
    //}
}
