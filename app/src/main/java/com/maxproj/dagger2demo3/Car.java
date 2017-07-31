package com.maxproj.dagger2demo3;

import javax.inject.Inject;

/**
 * Created by youhy on 17/7/27.
 */

public class Car {

    @MarkCarModule.QualifierA
    @Inject Engine engineA;
    @MarkCarModule.QualifierB
    @Inject Engine engineB;

    public Car() {
        DaggerCarComponent.builder().markCarModule(new MarkCarModule())
                .build().inject(this);
    }
    public Engine getEngineA() {
        return this.engineA;
    }
    public Engine getEngineB() {
        return this.engineB;
    }


}
