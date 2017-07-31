package com.maxproj.dagger2demo3;

import javax.inject.Inject;

/**
 * Created by youhy on 17/7/27.
 */

public class Car {

    @Inject
    Engine engine;

    public Car() {
        DaggerCarComponent.builder().markCarModule(new MarkCarModule())
                .build().inject(this);

    }
    public Engine getEngine() {
        return this.engine;
    }


}
