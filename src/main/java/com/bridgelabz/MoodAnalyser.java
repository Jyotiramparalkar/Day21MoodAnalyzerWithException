package com.bridgelabz;

public class MoodAnalyser {

    private String msg;

    public MoodAnalyser(){}

    public MoodAnalyser(String msg)
    {
        this.msg = msg;
    }

    public String analyseMood()
    {
        try{
            if (msg.contains("sad"))
            {
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch (NullPointerException exception)
        {
            return "HAPPY";
        }
    }
}
