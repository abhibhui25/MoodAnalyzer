package com.cg.moodanalyzer;

public class MoodAnalyzer {
        public String analyzeMood(String message){
            if(message.contains("sad"))
                return "sad";
            else
                return "happy";
    }
}

