package com.i.springboot.mode;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@TableName("yuangong")
public class YuanGong {
   @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private String chengren;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getChengren() {
        return chengren;
    }

    public void setChengren(String chengren) {
        this.chengren = chengren;
    }

    public String getXueji() {
        return xueji;
    }

    public void setXueji(String xueji) {
        this.xueji = xueji;
    }

    public String getGonzi() {
        return gonzi;
    }

    public void setGonzi(String gonzi) {
        this.gonzi = gonzi;
    }

    public String getBeian() {
        return beian;
    }

    public void setBeian(String beian) {
        this.beian = beian;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public String getJineng() {
        return jineng;
    }

    public void setJineng(String jineng) {
        this.jineng = jineng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    private String xueji;
    private String gonzi;
    private String beian;
    private String sfz;
    private String aihao;
    private String jineng;
    private String phone;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String number;
    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime;
    }

    private String submittime;


    @Override
    public String toString() {
        return "YuanGong{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", chengren='" + chengren + '\'' +
                ", xueji='" + xueji + '\'' +
                ", gonzi='" + gonzi + '\'' +
                ", beian='" + beian + '\'' +
                ", sfz='" + sfz + '\'' +
                ", aihao='" + aihao + '\'' +
                ", jineng='" + jineng + '\'' +
                ", phone='" + phone + '\'' +
                +
                '}';
    }

}
