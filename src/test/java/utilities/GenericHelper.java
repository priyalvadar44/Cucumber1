package utilities;

import stepDefinations.TestBase;

public class GenericHelper extends TestBase {

    public String getPageTitle(){
        return driver.getTitle();
    }
}
