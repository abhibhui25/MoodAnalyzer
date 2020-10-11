package com.cg.moodanalyzer;
import java.util.Scanner;
public class MoodAnalyzer {
    String message=null;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
        this.message = "";
    }
        public String analyzeMood(){
            try {
                if (message != null) {
                    if(message.contains("sad"))
                        return "sad";
                    else if(message.contains("happy"))
                        return "happy";
                }
            throw new MoodAnalyzerException();
            }
            catch (MoodAnalyzerException e) {
                return "happy";
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mood:");
        String message = sc.nextLine();
        MoodAnalyzer m = new MoodAnalyzer(message);
    }
}
class MoodAnalyzerException extends Exception {
    public MoodAnalyzerException() {
        System.out.println("happy");
    }}

