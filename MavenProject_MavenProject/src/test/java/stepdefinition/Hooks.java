package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks {

    @Before
    public void setup() throws IOException {
        System.out.println("....Browser Start.....");
        BaseCode.browserInvocation();
    }


    @After
    public void tearDown()
    {
        System.out.println("....Browser End.....");
    }

}
