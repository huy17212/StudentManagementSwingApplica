/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doituong;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author Huy1721
 */
public class doituongNV implements Serializable {

    private String name;
    private String email;
    private Double salary;
    private Integer age;
    private String idCode;
    private String imgPath;

    public doituongNV(String name, String email, Double salary, Integer age, String idCode, String imgPath) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.age = age;
        this.idCode = idCode;
        this.imgPath = imgPath;
    }

    public doituongNV() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("bạn không thể gán số âm hoặc số 0 vào lương được");
        } else {
            this.salary = salary;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getImg() {
        return imgPath;
    }

    public void setImg(String img) {
        this.imgPath = img;
    }

}
