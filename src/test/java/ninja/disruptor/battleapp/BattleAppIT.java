package ninja.disruptor.battleapp;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.page.InitialPage;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

@RunAsClient
@RunWith(Arquillian.class)
public class BattleAppIT {

    @Drone
    WebDriver browser;

    @Test
    public void shouldContainRobert(@InitialPage BattleAppPage page) {
        String expectedToContain = "Rob";
        String content = browser.getPageSource();
        assertThat(content, containsString(expectedToContain));
    }

}
