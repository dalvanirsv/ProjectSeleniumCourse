import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAlert {
		@Test	
		public void deveInteragirComAlertSimples(){
			System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");	
			
			driver.findElement(By.id("alert")).click();
			Alert alert = driver.switchTo().alert();
			String texto = alert.getText();
			Assert.assertEquals("Alert Simples", texto);
			alert.accept();
			
			driver.findElement(By.id("elementosForm:nome")).sendKeys(texto);
		driver.quit();
		} 
		@Test
		public void deveInteragirComBotaoConfirm(){
			System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");	
			
			driver.findElement(By.id("confirm")).click();
			Alert alert = driver.switchTo().alert();
			String texto = alert.getText();
			Assert.assertEquals("Confirm Simples", texto);
			alert.accept();
			Assert.assertEquals("Confirmado", texto);
			alert.accept();
			
			driver.findElement(By.id("confirm")).click();
			alert = driver.switchTo().alert();
			Assert.assertEquals("Confirm Simples", texto);
			alert.dismiss();
			Assert.assertEquals("Negado", texto);
			alert.dismiss();
		driver.quit();
		
		}
		@Test
		public void deveEfetuarUmCadastro(){
			System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");	
			
			driver.findElement(By.id("elementosForm:nome")).sendKeys("teste de escrita");		
			Assert.assertEquals("teste de escrita" , driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
			Assert.assertEquals("teste de escrita" , driver.findElement(By.id("elementosForm:sobrenome")).getAttribute("value"));
			
			driver.findElement(By.id("elementosForm:sexo:0")).click();
			Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
			
		}
}
