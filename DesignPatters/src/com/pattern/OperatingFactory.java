package com.pattern;

public class OperatingFactory {
    public OS getInstance(String str){
        if(str.equals("Open")){
            return new Windows();
        }else if(str.equals("Close")){
            return new Android();
        }
        return new IOS();
    }
}
