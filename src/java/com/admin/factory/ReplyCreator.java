/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.factory;

import com.admin.product.Lists;
import com.admin.product.Replys;

/**
 *
 * @author zxq
 */
public class ReplyCreator implements Creator{
    @Override
    public Lists getLists() {
        return new Replys();
    }
}
