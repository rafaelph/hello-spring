package com.rafaelkarlo.annotationconfig;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer cdPlayer;

    @Before
    public void setupLogger() {
        log.enableLog();
    }

    @Test
    public void compactDiscShouldNotBeNull() {
        assertThat(compactDisc, is(notNullValue()));
    }

    @Test
    public void mediaPlayerShouldPlayACompactDisc() {
        cdPlayer.play();
        assertThat(log.getLog(), containsString("Playing One by Metallica"));
    }

}
