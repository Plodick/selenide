package com.codeborne.selenide.webdriver;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Config;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;

class HtmlUnitDriverFactory extends AbstractDriverFactory {
  @Override
  boolean supports(Config config, Browser browser) {
    return browser.isHtmlUnit();
  }

  @Override
  WebDriver create(Config config, Proxy proxy) {
    return createHtmlUnitDriver(config, proxy);
  }

  private WebDriver createHtmlUnitDriver(Config config, Proxy proxy) {
    return createInstanceOf("org.openqa.selenium.htmlunit.HtmlUnitDriver", config, proxy);
  }
}
