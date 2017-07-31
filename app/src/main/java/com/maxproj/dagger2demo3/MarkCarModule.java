package com.maxproj.dagger2demo3;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;


@Module
public class MarkCarModule {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public static @interface QualifierA { }
    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public static @interface QualifierB { }

    public MarkCarModule(){ }
    @QualifierA
    @Provides
    Engine provideEngineA(){
        return new Engine("gearA");
    }
    @QualifierB
    @Provides
    Engine provideEngineB(){
        return new Engine("gearB");
    }
}

