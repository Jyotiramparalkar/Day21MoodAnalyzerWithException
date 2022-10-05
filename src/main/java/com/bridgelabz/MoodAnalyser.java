package com.bridgelabz;

public class MoodAnalyser {

    private String msg;

    public MoodAnalyser(){}

    public MoodAnalyser(String msg){
        this.msg = msg;
    }

    public String analyseMood() throws MoodAnalysisException {

        if (msg == null){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL,"null mood is invalid!");
        }else if (msg.length() == 0){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY,"Empty mood is invalid!");
        }else if (msg.contains("sad")){
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
