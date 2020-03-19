package com.example.graduation.request.course.requestEntity;

public class GradeItem {
    private String itemName;
    private int proportion;
    private float stuGrade;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    public float getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(float stuGrade) {
        this.stuGrade = stuGrade;
    }
}
