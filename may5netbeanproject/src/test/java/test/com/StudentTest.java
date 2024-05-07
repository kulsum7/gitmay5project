/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.may5netbeanproject.Student;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kulsum
 */
public class StudentTest {
    Student stu;
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        stu=new Student("tom",1,"tom@ab.com");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testEmail() throws Exception{
        assertEquals(stu.getEmail(), "tom@ab.com");
    }
    @Test
    public void testFirst() throws Exception{
        assertEquals(stu.getFirstname(), "tom");
    }
}
