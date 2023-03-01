package javatest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;

//Junit的基本注解

//@BeforeClass注解的方法
//只会被运行一次
//运行这个测试类时会被第一个执行
//执行代价比较大的任务时使用，并且应该是静态方法



//@AfterClass只执行一次 运行测试类的时候是最后执行的方法  同样是静态

//@Before   在任意一个测试方法执行前都会执行这个方法

//@After    在任意一个测试方法执行后都会执行这个方法

//@Test     这个注解内包含真正的测试代码有两个可选参数  expected表示抛出的异常(值为异常名称)  timeout检测测试方法的执行时间()

public class JUnitTest1 {

	@BeforeClass
	public static void setUpClass() {
		System.out.println("@BeforeClass Func ");
	}
	@AfterClass
	public static void teardownClass() {
		System.out.println("@AfterClass Func ");
	}
	
	@Before
	public void beforeFunc() {
		System.out.println("@Before  Func ");
	}
	
	@After
	public void afterFunc() {
		System.out.println("@After Func");
		
	}
	@Test
	public void test() {
		test1 test1Obj=new test1();
		int result=test1Obj.add(1, 2);
		int expectedResult=3;
		assertEquals(expectedResult,result);
		
		System.out.println("@Test Func");
	}
	@Test 
	public void test2() {
		assertEquals(2,2);
		System.out.println("testFunc2");
	}
	

}
