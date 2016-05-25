/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.factory;

import com.admin.product.Lists;
import com.admin.product.Users;

/**
 *
 * @author zxq
 */
public class UserCreator implements Creator{
    @Override
    public Lists getLists() {
        return new Users();
    }
}
