package com.cg.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;
public class MoodAnalyzerTest {

    @Test
    public void givenMessage_WhenSadShouldReturnSad() {
        MoodAnalyzer m=new MoodAnalyzer();
        String mood=m.analyzeMood("I am in sad mood");
        Assert.assertEquals("sad",mood);
    }
    @Test
    public void givenMessage_WhenNotSadShouldReturnHappy() {
        MoodAnalyzer m=new MoodAnalyzer();
        String mood=m.analyzeMood("I am in happy mood");
        Assert.assertEquals("happy",mood);
    }
}
