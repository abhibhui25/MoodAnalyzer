package com.cg.moodanalyzer;

public class MoodAnalyzer {
    String message=null;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = "";
    }
        public String analyzeMood(){
            if(message.contains("sad"))
                return "sad";
            else
                return "happy";
    }
}

