package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String result = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertEquals("SAD",result);

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String result = moodAnalyser.analyseMood("This is a any message");
        Assert.assertEquals("HAPPY",result);
    }
}
