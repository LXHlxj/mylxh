package com.i.springboot.mode;

import org.springframework.stereotype.Repository;

@Repository
public class Page1 {
    private Integer limit=10;


    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer page=0;
    private String name;
}
