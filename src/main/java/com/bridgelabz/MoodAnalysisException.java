package com.bridgelabz;

public class MoodAnalysisException extends Exception
{
    enum ExceptionType {
        EMPTY,
        NULL,
    }

    ExceptionType type;
    public MoodAnalysisException(ExceptionType type,String msg){
        super(msg);
        this.type = type;
    }
}
