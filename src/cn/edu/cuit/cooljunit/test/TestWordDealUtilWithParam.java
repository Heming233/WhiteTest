package cn.edu.cuit.cooljunit.test;

import static org.junit.Assert.assertEquals;

import cn.edu.cuit.cooljunit.WordDealUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestWordDealUtilWithParam {
    private String expected;
    private String target;

    @Parameters
    public static Collection word(){
        return Arrays.asList(new Object[][]{
                {"employee_info","employeeInfo"},
                {null,null},
                {"",""},
                {"employee_info","EmployeeInfo"},
                {"employee_info_a","employeeInfoA"},
                {"employee_a_info","employeeAInfo"}
        });
    }

    public TestWordDealUtilWithParam(String expected,String target){
        this.expected=expected;
        this.target=target;
    }

    @Test
    public void wordFormat4DB(){
        assertEquals(expected, WordDealUtil.wordFormat4DB(target));
    }
}
