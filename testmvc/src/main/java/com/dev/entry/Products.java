package com.dev.entry;

import java.util.Date;

public class Products {

    private Integer id;
    private String p_name;
    private Double p_price;
    private Integer p_num;
    private Long p_tel;
    private Date p_date;


    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public Double getP_price() {
        return p_price;
    }

    public void setP_price(Double p_price) {
        this.p_price = p_price;
    }

    public Integer getP_num() {
        return p_num;
    }

    public void setP_num(Integer p_num) {
        this.p_num = p_num;
    }

    public Long getP_tel() {
        return p_tel;
    }

    public void setP_tel(Long p_tel) {
        this.p_tel = p_tel;
    }

    public Date getP_date() {
        return p_date;
    }

    public void setP_date(Date p_date) {
        this.p_date = p_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
