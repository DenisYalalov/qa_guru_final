package configs;

import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;

public class OwnerApiConfigRunner {
    static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

    public void runApiConfig() {
        RestAssured.baseURI = apiConfig.getApiBaseUrl();


    }
}

