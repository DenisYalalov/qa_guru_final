package configs;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface ApiConfig extends Config {
    @DefaultValue("https://api.m3o.com")
    @Key("ApiBaseUrl")
    String getApiBaseUrl();

    @DefaultValue("Bearer ODM4YzhjNzktZjA1Ni00YjljLWJlODYtNjY5YmZjNTVhNWU4")
    @Key("ApiToken")
    String getApiToken();


}
