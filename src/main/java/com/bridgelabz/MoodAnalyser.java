package com.bridgelabz;

public class MoodAnalyser
{
    public String analyseMood(String msg) {
        if (msg.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
