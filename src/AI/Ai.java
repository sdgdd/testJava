package AI;

import java.sql.Array;
import java.util.Arrays;

public class Ai {
    public String answer(String question){
        String result ="";
        result = handleFirstWorld(question);
        if(!result.isEmpty()){
            return result;
        }
        result =handleLastWorld(question);
        if(!result.isEmpty()){
            return result;
        }
       return handleUnknown(question);
    }

    private String handleFirstWorld(String question){
        if(question.isEmpty()){
            return  "";
        }
        String[] includeFirstStr = new String[]{"会","能","敢","在"};
        String firstWorld = question.split("")[0];
        if(Arrays.asList(includeFirstStr).contains(firstWorld)){
            return  firstWorld+"!";
        }
        return  "";
    }

    private String handleLastWorld(String question){
        if(question.isEmpty()){
            return  "";
        }
        String[] includeFirstStr = new String[]{"吗","吗？","吗?"};
        for(String str:includeFirstStr){
            if(question.contains(str)){
                return question.substring(0,question.indexOf(str));
            }
        }

        return  "";
    }

    private String handleUnknown(String question){
        return  question+"!";
    }



}
