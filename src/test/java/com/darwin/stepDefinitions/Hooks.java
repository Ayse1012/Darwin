package com.darwin.stepDefinitions;

import com.darwin.utilities.ConfigurationReader;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.*;
public class Hooks {
    @Before

    public void setUp(){
        baseURI= ConfigurationReader.get("base_Url");
    }

}
