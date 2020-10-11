package com.cg.moodanalyzer;
import java.util.Scanner;
public class MoodAnalyzer {
        String message=null;


        public String analyzeMood(String message) {
            if(message.equalsIgnoreCase("happy"))
                return "happy";
            else if(message.equalsIgnoreCase("sad"))
                return "sad";
        }

    }

