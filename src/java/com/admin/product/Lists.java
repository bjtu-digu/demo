/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.product;

import java.util.List;

/**
 *
 * @author zxq
 */
public interface Lists {
    public List get();
    public boolean changeStatus(String status, String id);
}
