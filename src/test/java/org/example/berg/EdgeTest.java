package org.example.berg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EdgeTest {

    @Test
    @DisplayName("My Resume Hyperlink Button Test")
    public void MyResumeCheck() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Resume")).isDisplayed();
            driver.findElement(By.linkText("My Resume")).click();
            assertEquals("https://github.com/Alexander-Berg/A.Berg-Resume", driver.getCurrentUrl());
            boolean isButtonVisible1 = driver.findElement(By.linkText("README.md")).isDisplayed();
            System.out.println("My Resume Hyperlink Button Test was successful");
        } finally {
            driver.quit();
        }


    }

    @Test
    @DisplayName("My HH Hyperlink Button Test")
    public void MyHHCheck() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Headhunter")).isDisplayed();
            driver.findElement(By.linkText("My Headhunter")).click();
            assertEquals("https://spb.hh.ru/resume/a3e8efc0ff091a411a0039ed1f714e79426a54", driver.getCurrentUrl());
            System.out.println("My HH Hyperlink Button Test was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("My linkedInButtonTextTest")
    public void MyLinkedCheck() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Linkedin")).isDisplayed();
            System.out.println("My Linkedin Link Test was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("My GitHub Test")
    public void MyGitHubCheck() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            boolean isButtonVisible = driver.findElement(By.linkText("My GitHub")).isDisplayed();
            driver.findElement(By.linkText("My GitHub")).click();
            assertEquals("https://github.com/Alexander-Berg", driver.getCurrentUrl());
            boolean isButtonVisible1 = driver.findElement(By.linkText("Resume & Software skills")).isDisplayed();
            System.out.println("My GitHub Link Test was successful");
        } finally {
            driver.quit();
        }
    }

    /* @Test
     @DisplayName("My Incorrect Test")
     public void IncorrectCheck() {
         WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
         try {
             driver.get("https://alexander-berg.github.io");
             driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

             boolean isButtonVisible = driver.findElement(By.linkText("My Incorrect")).isDisplayed();
             System.out.println("My Incorrect Link Test was successful");
         }
         finally {
             driver.quit();
         }
     }

     */

    @Test
    @DisplayName("MyTelegramButtonTextTest")
    public void MyTelegramButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Telegram")).isDisplayed();
            System.out.println("MyTelegramButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyFacebookButtonTextTest")
    public void MyFacebookButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Facebook")).isDisplayed();
            System.out.println("MyFacebookButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyEmailButtonTextTest")
    public void MyEmailButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Email")).isDisplayed();
            System.out.println("MyEmailButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyGoogleDevButtonTextTest")
    public void MyGoogleDevButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Google Dev")).isDisplayed();
            System.out.println("MyGoogleDevButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyQADiplomaButtonTextTest")
    public void MyQADiplomaButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("QA Diploma Project")).isDisplayed();
            System.out.println("MyQADiplomaButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyQAMindmapsButtonTextTest")
    public void MyQAMindmapsButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("QA Mindmaps")).isDisplayed();
            System.out.println("MyQAMindmapsButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyITNewsButtonTextTest")
    public void MyITNewsButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("IT News")).isDisplayed();
            System.out.println("MyITNewsButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyDiscordButtonTextTest")
    public void MyDiscordButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Discord")).isDisplayed();
            System.out.println("MyDiscordButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyStackOverflowButtonTextTest")
    public void MyStackOverflowButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("Stack Overflow")).isDisplayed();
            System.out.println("MyStackOverflowButtonTextTest");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyVKButtonTextTest")
    public void MyVKButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My VK")).isDisplayed();
            System.out.println("MyVKButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }

   /* @Test
    @DisplayName("MyInstagramButtonTextTest")
    public void MyInstagramButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Instagram")).isDisplayed();
            System.out.println("MyInstagramButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }
*/
    @Test
    @DisplayName("MyTwitterButtonTextTest")
    public void MyTwitterButtonTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.linkText("My Twitter")).isDisplayed();
            System.out.println("MyTwitterButtonTextTest was successful");
        } finally {
            driver.quit();
        }
    }
    @Test
    @DisplayName("MyHeaderTextTest")
    public void MyHeaderTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.xpath("//*[text()='Hi there, Im Alexander Berg!']")).isDisplayed();
            System.out.println("MyHeaderTextTest was successful");
        } finally {
            driver.quit();
        }
    }

    @Test
    @DisplayName("MyFooterTextTest")
    public void MyFooterTextTest() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        try {
            driver.get("https://alexander-berg.github.io");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
            boolean isButtonVisible = driver.findElement(By.xpath("//*[text()='Created by Alexander Berg,2021']")).isDisplayed();
            System.out.println("MyFooterTextTest was successful");
        } finally {
            driver.quit();
        }
    }
}
