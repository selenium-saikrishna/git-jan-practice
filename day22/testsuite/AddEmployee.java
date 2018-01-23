package day22.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmployee  extends BaseClass{

	@Test
	public void addEmployeetest()
	{
		//xpath of PIM
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Sai");
		driver.findElement(By.id("middleName")).sendKeys("Krishna");
		driver.findElement(By.id("lastName")).sendKeys("g");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("1111");
		driver.findElement(By.id("btnSave")).click();
	}
}









