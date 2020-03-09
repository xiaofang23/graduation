package com.example.graduation.request.course.requestEntity;

public class EvaItem {

    private String itemName;
    private int proportion;
    private float targetScore;
    private float studentAvgScore;

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

    public float getTargetScore() {
        return targetScore;
    }

    public void setTargetScore(float targetScore) {
        this.targetScore = targetScore;
    }

    public float getStudentAvgScore() {
        return studentAvgScore;
    }

    public void setStudentAvgScore(float studentAvgScore) {
        this.studentAvgScore = studentAvgScore;
    }
}
