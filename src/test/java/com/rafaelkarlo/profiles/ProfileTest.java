package com.rafaelkarlo.profiles;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ProfileConfig.class } )
public abstract class ProfileTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    protected ProfileBean profileBean;

    @Before
    public void setupLogger() {
        log.enableLog();
    }

    @Test
    public void profileBeanShouldNotBeNull() {
        assertThat(profileBean, is(notNullValue()));
    }


}
