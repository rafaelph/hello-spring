package com.rafaelkarlo.main;

import com.rafaelkarlo.configuration.ProfileConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProfileConfig.class } )
@ActiveProfiles(profiles = {"dev"} )
public class DevProfileTest extends ProfileTest{
    @Test
    public void profileBeanShouldPrintTheCorrectMessage() {
        profileBean.execute();
        assertThat(log.getLog(), containsString("This is a Dev profile bean"));
    }
}
