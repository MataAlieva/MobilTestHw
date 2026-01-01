package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/browserstack.properties"
})
public interface BrowserstackConfig extends Config {
    @Key("browserstack.user")
    String browserstackUser();

    @Key("browserstack.key")
    String browserstackKey();

    @Key("browserstack.url")
    @DefaultValue("https://hub-cloud.browserstack.com/wd/hub")
    String browserstackUrl();

    @Key("app.url")
    @DefaultValue("bs://sample.app")
    String appUrl();

    @Key("device.name")
    @DefaultValue("Samsung Galaxy A51")
    String deviceName();

    @Key("android.version")
    @DefaultValue("10.0")
    String osVersion();
}