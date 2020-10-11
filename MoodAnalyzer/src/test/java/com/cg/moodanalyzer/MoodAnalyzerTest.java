package com.cg.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;
public class MoodAnalyzerTest {
    MoodAnalyzer m;
    @Test
    public void givenMessage_WhenSadShouldReturnSad() {
        m=new MoodAnalyzer("I am in sad mood");
        Assert.assertEquals(m.analyzeMood(),"sad");
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        m=new MoodAnalyzer("I am in happy mood");
        Assert.assertEquals(m.analyzeMood(),"happy");
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy() {
        m=new MoodAnalyzer("I am in happy mood");
        Assert.assertEquals(m.analyzeMood(),"happy");
    }
}
