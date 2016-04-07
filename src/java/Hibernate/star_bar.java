/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author zqhPC
 */
public class star_bar  implements java.io.Serializable {
    int user_id;
    int bar_id;
    int sign_num;
    int exist;
    int sign;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.user_id;
        hash = 19 * hash + this.bar_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final star_bar other = (star_bar) obj;
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.bar_id != other.bar_id) {
            return false;
        }
        return true;
    }

    public star_bar() {
    }

    public star_bar(int user_id, int bar_id, int sign_num, int exist, int sign) {
        this.user_id = user_id;
        this.bar_id = bar_id;
        this.sign_num = sign_num;
        this.exist = exist;
        this.sign = sign;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }

    public int getSign_num() {
        return sign_num;
    }

    public void setSign_num(int sign_num) {
        this.sign_num = sign_num;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    public int getSign() {
        return sign;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }
    
}
