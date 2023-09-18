// package runner;

// import org.testng.annotations.Test;
// import com.aventstack.extentreports.ExtentReports;
// import org.openqa.selenium.WebDriver;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.DataProvider;
// import org.testng.annotations.Test;
// import utils.Base;
// import utils.LoggerHandler;
// import utils.base64;
// import utils.Reporter;
// import pages.homepage;

// import java.io.IOException;
// import java.net.MalformedURLException;

// public class runner extends Base {

//     homepage homePage = new homepage();

//  @Test(priority =1)
//     public void runTest() throws IOException { 
//             driver.get(prop.getProperty("url") + "/Login");
//             homePage.Valid_Login_TC(driver);

//     }


// @BeforeMethod
//     public void beforeMethod() throws MalformedURLException {
//         openBrowser();
    
//     }

// @AfterMethod
//     public void afterMethod() {
//         driver.quit();
//     }
// }
