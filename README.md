# Dagger2Demo3

Pure and very simple java code to show dagger2's normal usage. The only code that made me known dagger2 just before I give up. I have a [blog](http://blog.csdn.net/max2005/article/details/76652819) about where this code come from.

Total 4 core classes:
    
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
    
    @Component(modules = {MarkCarModule.class})
    public interface CarComponent {
        void inject(Car car);
    }

    public class Engine {
        String engine_run;
        public Engine(){}
        public Engine(String s){engine_run = s;}
        public String run(){return engine_run;}
    }

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