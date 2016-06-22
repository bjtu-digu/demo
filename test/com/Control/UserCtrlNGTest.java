/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

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
public class UserCtrlNGTest {
    
    public UserCtrlNGTest() {
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
     * getSignNum方法的测试 (属于类UserCtrl)。
     *  @Test
    public void testGetSignNum2() {
        System.out.println("getSignNum");
        String bar_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getSignNum(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
    *  @Test
    public void testGetSignNum3() {
        System.out.println("getSignNum");
        String bar_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getSignNum(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }
     */
    @Test
    public void testGetSignNum1() {
        System.out.println("getSignNum");
        String bar_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = "1";
        String result = instance.getSignNum(bar_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
      
    }

    /**
     * getUserId方法的测试 (属于类UserCtrl)。
     *   @Test
    public void testGetUserId2() {
        System.out.println("getUserId");
        String user_name = "Tin";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserId(user_name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
    *   @Test
    public void testGetUserId3() {
        System.out.println("getUserId");
        String user_name = "Tin";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserId(user_name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
     */
    @Test
    public void testGetUserId1() {
        System.out.println("getUserId");
        String user_name = "Tin";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = "1";
        String result = instance.getUserId(user_name);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }

   
   

   
    /**
     * getUserName方法的测试 (属于类UserCtrl)。
     *  @Test
    public void testGetUserName12() {
        System.out.println("getUserName");
       UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserName();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
    *  @Test
    public void testGetUserName13() {
        System.out.println("getUserName");
       UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserName();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }
     */
    @Test
    public void testGetUserName11() {
        System.out.println("getUserName");
       UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = "Tin";
        String result = instance.getUserName();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
        
    }

    /**
     * getUserName1方法的测试 (属于类UserCtrl)。
     *  @Test
    public void testGetUserName2() {
        System.out.println("getUserName1");
        String user_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserName1(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
    *  @Test
    public void testGetUserName3() {
        System.out.println("getUserName1");
        String user_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = null;
        String result = instance.getUserName1(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
     */
    @Test
    public void testGetUserName1() {
        System.out.println("getUserName1");
        String user_id = "1";
        UserCtrl instance = new UserCtrl("Tin", "1");
        String expResult = "Tin";
        String result = instance.getUserName1(user_id);
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

    /**
     * getBarNum方法的测试 (属于类UserCtrl)。
     *  @Test
    public void testGetBarNum3() {
        System.out.println("getBarNum");
        UserCtrl instance = new UserCtrl("Tin", "1");
        int expResult = 2;
        int result = instance.getBarNum();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }
 @Test
    public void testGetBarNum2() {
        System.out.println("getBarNum");
        UserCtrl instance = new UserCtrl("Tin", "1");
        int expResult = 3;
        int result = instance.getBarNum();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

     */
    @Test
    public void testGetBarNum1() {
        System.out.println("getBarNum");
        UserCtrl instance = new UserCtrl("Tin", "1");
        int expResult = 1;
        int result = instance.getBarNum();
        assertEquals(result, expResult);
        // TODO 检查生成的测试代码并删除失败的默认调用。
       
    }

  


    /**
     * getMyBarName方法的测试 (属于类UserCtrl)。
     */
   

    /**
     * getPostId方法的测试 (属于类UserCtrl)。
     */
   
}
