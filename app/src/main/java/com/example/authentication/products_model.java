package com.example.authentication;

public class products_model {
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public products_model() {
    }

    public products_model(String courseName, String courseDescription, String courseDuration) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    String courseName,courseDescription,courseDuration;



//    public products_model(){};
//    public products_model(String name,String desc,String date){
//        courseName = name;
//        courseDescription= desc;
//        courseDuration=date;
//    }
/*    public String getName(){
        return courseName;
    }
    public void setName(String name){
        courseName = name;
    }
    public String getDesc(){
        return courseDescription;
    }
    public void setDesc(String desc){
        courseDescription = desc;
    }
    public String getDate(){
        return courseDuration;
    }
    public void setDate(String date){
        courseDuration = date;
    }*/

}
