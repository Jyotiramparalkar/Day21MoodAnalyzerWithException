package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test

    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD",result);
        }
        catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",result);
        }catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void givenNullMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL,exception.type);
        }
    }

    @Test
    public void givenEmptyMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,exception.type);
        }
    }


}
