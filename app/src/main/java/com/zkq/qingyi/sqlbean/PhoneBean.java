package com.zkq.qingyi.sqlbean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by ${小强同学} on 2017/11/27
 * 实体类不支持kotlin  支持javas
 */
@Entity
public class PhoneBean {

    //不能用int
    @Id(autoincrement = true)
    private Long id;
    private String Years; //年月
    private String phone;//手机
    private String time;//时间
    private String SpecificDate;//年月日

    @Generated(hash = 1893229772)
    public PhoneBean(Long id, String Years, String phone, String time, String SpecificDate) {
        this.id = id;
        this.Years = Years;
        this.phone = phone;
        this.time = time;
        this.SpecificDate = SpecificDate;
    }

    @Generated(hash = 1246458232)
    public PhoneBean() {
    }

    public String getYears() {
        return Years;
    }

    public void setYears(String years) {
        Years = years;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSpecificDate() {
        return SpecificDate;
    }

    public void setSpecificDate(String specificDate) {
        SpecificDate = specificDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PhoneBean{" +
                "id=" + id +
                ", Years='" + Years + '\'' +
                ", phone='" + phone + '\'' +
                ", time='" + time + '\'' +
                ", SpecificDate='" + SpecificDate + '\'' +
                '}';
    }
}
