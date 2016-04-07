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
public class star_user  implements java.io.Serializable {
    int user_id;
    int star_id;
    int exist;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.user_id;
        hash = 37 * hash + this.star_id;
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
        final star_user other = (star_user) obj;
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.star_id != other.star_id) {
            return false;
        }
        return true;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getStar_id() {
        return star_id;
    }

    public void setStar_id(int star_id) {
        this.star_id = star_id;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    public star_user() {
    }

    public star_user(int user_id, int star_id, int exist) {
        this.user_id = user_id;
        this.star_id = star_id;
        this.exist = exist;
    }
    
}
