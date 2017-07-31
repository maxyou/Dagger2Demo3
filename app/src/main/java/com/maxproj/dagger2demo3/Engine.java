package com.maxproj.dagger2demo3;

/**
 * Created by youhy on 17/7/27.
 */

public class Engine {

    String engine_run;

    public Engine(){

    }

    public Engine(String s){
        engine_run = s;
    }

    public String run(){
        return engine_run;
    }

}
