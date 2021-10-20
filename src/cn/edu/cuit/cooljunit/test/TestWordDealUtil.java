package cn.edu.cuit.cooljunit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import cn.edu.cuit.cooljunit.WordDealUtil;
import org.junit.Test;

public class TestWordDealUtil {
    @Test
    public void wordFormat4DBNormal(){
        String target="employeeInfo";
        String result= WordDealUtil.wordFormat4DB(target);
        assertEquals("employee_info",result);
    }

    @Test
    public void wordFormat4DBNull(){
        String target=null;
        String result=WordDealUtil.wordFormat4DB(target);
        assertNull(target);
    }

    @Test
    public void wordFormat4DBEmpty(){
        String target="";
        String result=WordDealUtil.wordFormat4DB(target);
        assertEquals("",target);
    }

    @Test
    public void wordFormat4DBegin(){
        String target="EmployeeInfo";
        String result=WordDealUtil.wordFormat4DB(target);
        assertEquals("employee_info",result);
    }

    @Test
    public void wordFormat4DBEnd(){
        String target="employeeInfoA";
        String result=WordDealUtil.wordFormat4DB(target);
        assertEquals("employee_info_a",target);
    }

    @Test
    public void wordFormat4DBTogether(){
        String target="employeeAInfo";
        String result=WordDealUtil.wordFormat4DB(target);
        assertEquals("employee_a_info",result);
    }

}
