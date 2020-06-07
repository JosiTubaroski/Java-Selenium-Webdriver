package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformantsUsurerTest {
    @Test
    public void testAficionadoInformationUsual(){

        //Abrir o google chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Josi\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Definir time out da página
        navegador.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //Abrir a URL do site Julio de Lima
        navegador.get("http://www.juliodelima.com.br/taskit");


        //Clicar no link do Sign In
        navegador.findElement(By.linkText("Sign in")).click();

        //Clicar no campo Login que está dentro do formulario de "signinbox"
        //Digitar no campo Login que está dentro do formulario de "sign box" o texto "julio001"

        WebElement formulariosign = navegador.findElement(By.id("signinbox"));
        formulariosign.findElement(By.name("login")).sendKeys("julio0001");

        //Clicar no campo Password que está dentro do formulario de "sign box"
        //Digitar no campo Password que está dentro do formulario de "sign box" o texto "123456"
        formulariosign.findElement(By.name("password")).sendKeys("123456");

        // Clica no Link com o texto sign in
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" está com o texto "Hi, Julio"
        WebElement me = navegador.findElement(By.className("me"));
        String textonoelementome = me.getText();
        Assert.assertEquals("Hi, Julio",textonoelementome);
        //Fechar o navegador
        navegador.quit();
    }
}
