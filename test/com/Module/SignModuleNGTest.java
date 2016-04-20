/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author zqhPC
 */
public class SignModuleNGTest {
    
    public SignModuleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Sign方法的测试 (属于类SignModule)。
     */
    @Test
    public void testSign() {
       
    }

    /**
     * getUserID方法的测试 (属于类SignModule)。
     */
    @Test
    public void testGetUserID1() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "1";
        String result = SearchModule.getUserID(name);
        assertEquals(result, expResult);
       
    }
    @Test
    public void testGetUserID2() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "666";
        String result = SearchModule.getUserID(name);
        assertEquals(result, expResult);
       
    }
    @Test
    public void testGetUserID3() {
        System.out.println("getUserID");
        String name = "Tin";
        String expResult = "777";
        String result = SearchModule.getUserID(name);
        assertEquals(result, expResult);
       
    }
    
}
