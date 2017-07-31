package com.maxproj.dagger2demo3;


import dagger.Module;
import dagger.Provides;

@Module
public class MarkCarModule {

    public MarkCarModule(){ }

    @Provides
    Engine provideEngine(){
        return new Engine("gear");
    }
}
