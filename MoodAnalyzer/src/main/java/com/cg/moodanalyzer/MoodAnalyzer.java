package com.cg.moodanalyzer;
import java.util.Scanner;

enum Error {
    EmptyError, NullError;
}
public class MoodAnalyzer {
    public Error error;
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
                    else if(message.isEmpty()) {
                        this.error=Error.EmptyError;
                        throw new MoodAnalyzerException();
                    }
                }
            this.error=Error.NullError;
            throw new MoodAnalyzerException();
            }
            catch (MoodAnalyzerException e) {
                return "invalid";
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
        System.out.println("invalid");
    }}

