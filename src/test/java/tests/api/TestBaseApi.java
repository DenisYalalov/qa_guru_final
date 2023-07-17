package tests.api;

import configs.OwnerApiConfigRunner;
import org.junit.jupiter.api.BeforeAll;


public class TestBaseApi {
    @BeforeAll
    static void beforeAll() {
        new OwnerApiConfigRunner().runApiConfig();
    }
}

