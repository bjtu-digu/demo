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
public class teacher  implements java.io.Serializable {
    int bar_id;
    int user_id;
    int exist;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.bar_id;
        hash = 47 * hash + this.user_id;
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
        final teacher other = (teacher) obj;
        if (this.bar_id != other.bar_id) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        return true;
    }

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    public teacher() {
    }

    public teacher(int bar_id, int user_id, int exist) {
        this.bar_id = bar_id;
        this.user_id = user_id;
        this.exist = exist;
    }
    
}
