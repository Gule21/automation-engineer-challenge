package stepDefinitions;

import io.cucumber.java.Before;
import utils.BrowserUtils;
import utils.Driver;

public class Hooks extends BrowserUtils {
     @Before
    public void setup(){
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        Driver.getDriver().manage().window().maximize();
    }

}
