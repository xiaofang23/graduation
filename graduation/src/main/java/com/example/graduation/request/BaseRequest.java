package com.example.graduation.request;

import org.springframework.web.bind.annotation.RequestParam;

public class BaseRequest {

    private int id;
    private int pageNum = 1;
    private int pageSize = 30;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
