import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Treinamento1 {
		// para escrever na caixa de texto
		@Test	
		@Ignore
		public void test(){
			System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
			driver.findElement(By.id("elementosForm:nome")).sendKeys("teste de escrita");		
			Assert.assertEquals("teste de escrita" , driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		driver.quit();
		} 
			@Test
			@Ignore
			public void deveInteragirComTextA() {
				System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
					driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste");
				Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
					
			driver.quit();
			}
			
			@Test
			//clicar no Radio
			public  void InteragirComRadioButton(){
				System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().setSize(new Dimension(1200, 765));
				driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
				driver.findElement(By.id("elementosForm:sexo:0")).click();
			Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
				
			driver.quit();
			}
			@Test
			@Ignore
			//clicar no checkbox
			public  void InteragirComCheckbox(){
				System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().setSize(new Dimension(1200, 765));
				driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
				driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
			Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
				
			driver.quit();
			
			}
			@Test
			@Ignore
			public void deveInteragirApertarBotao() {
				System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
				WebElement botao = driver.findElement(By.id("buttonSimple"));
				botao.click();
				
				Assert.assertEquals("Obrigado!", botao.getAttribute("value"));
				driver.quit();
			}
			@Test
			@Ignore
			public void deveInteragirComLinks() {
				System.setProperty("webdriver.chrome.driver" , "C:\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("file:///C:/Users/eeepd/eclipse-workspace/CursoSelenion/src/main/resources/componentes.html");
				driver.findElement(By.linkText("Voltar")).click();
				driver.quit();
		}
		}
