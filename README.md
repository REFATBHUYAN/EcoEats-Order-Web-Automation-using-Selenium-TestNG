# EcoEats Ordering System Automation

This project demonstrates an **automation testing suite** for the **EcoEats** website's ordering system. It leverages **Selenium** for browser automation and **TestNG** for test execution, ensuring that the order placement process is functioning seamlessly.

## 📋 Project Overview

The objective of this project is to automate the order placement process on the EcoEats website using Selenium and TestNG, validating the form submission flow with given test data and ensuring that the ordering functionality works as expected.

### 🛠 Tech Stack

- **Selenium WebDriver**: Browser automation tool used to simulate user interactions.
- **TestNG**: Testing framework for running test cases.
- **Java**: The programming language used to implement the automation scripts.
- **ChromeDriver**: Chrome browser driver to interact with the website.

## 🖥️ Automation Process

The script automates the following steps:

1. Open the EcoEats website.
2. Fill out the **Name**, **Phone Number**, and **Address** fields in the order form.
3. Submit the order by clicking the **Place Order** button.
4. Close the browser after a short delay.

### 🧩 Key Automation Script

```java
package selenium.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcoEatsOrder {
    WebDriver driver;

    @Test
    public void ecoeatsOrder() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ecoeatsbd.netlify.app/");
        driver.findElement(By.name("name")).sendKeys("Admin Refat");
        driver.findElement(By.name("phone")).sendKeys("01575267132");
        driver.findElement(By.name("address")).sendKeys("Dhaka Bangladesh Selenium");
        driver.findElement(By.xpath("//*[@id=\"order\"]/div/div/div[1]/div/div[2]/div/button")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
```

### 🚀 Steps to Run the Test

1. **Clone the Repository**:  
   Clone the project to your local machine using the following command:
   ```bash
   git clone [https://github.com/yourusername/ecoeats-ordering-system-automation.git](https://github.com/REFATBHUYAN/EcoEats-Order-Web-Automation-using-Selenium-TestNG
   ```

2. **Set Up Environment**:
   - Ensure Java (JDK 8 or above) is installed.
   - Install **Maven** (for dependency management).
   - Add `WebDriverManager` to automatically manage the ChromeDriver setup.

3. **Run the Test**:
   - Navigate to the project directory and run the test with TestNG:
   ```bash
   mvn test
   ```

4. **Test Output**:
   The script will automatically open the EcoEats website, simulate the form input, submit the order, and close the browser.

### ⚙️ Prerequisites

Before running the test, ensure you have:

- **Java Development Kit (JDK)**
- **Maven** for dependency management
- **Selenium WebDriver** and **ChromeDriver**

### 📦 Project Structure

```
EcoEatsOrderAutomation/
├── src/
│   └── test/
│       └── java/
│           └── selenium/
│               └── Tests/
│                   └── EcoEatsOrder.java
├── pom.xml
└── README.md
```

### 🧪 Test Scenarios

- **Positive Test**: The user inputs valid details and successfully places an order.
- **Negative Test**: (Potential future enhancements) Add scenarios where invalid or missing input data is handled by the system.

## 💡 Why This Project?

This automation project showcases the ability to:

- Efficiently automate repetitive tasks like form submissions.
- Validate end-to-end workflows in web applications.
- Utilize industry-standard tools like Selenium and TestNG in Java to build robust test scripts.

## 📈 Future Enhancements

- Implement negative test cases for form validation.
- Add multi-browser testing support.

## 🎯 Key Takeaways

This automation project is a demonstration of my ability to create reliable and scalable automated tests for web applications, ensuring smooth user experiences. It highlights expertise in **Selenium**, **TestNG**, and handling real-world scenarios in test automation.
