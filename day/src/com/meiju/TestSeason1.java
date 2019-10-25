package com.meiju;

public class TestSeason1 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());
        Season1[] season1s = Season1.values();
        String str = "SPRING";
        Season1 sea = Season1.valueOf(str);
        System.out.println(sea);
        Thread.State[] states = Thread.State.values();
        for (int i=0;i<states.length;i++){
            System.out.println(states[i]);
        }

    }
}
interface  Info {
    void show();
}

enum Season1 implements Info{
    SPRING ("spring","chuntian"){
        public void show(){
            System.out.println("wher spring");
        }
    },
    SUMMER ("summer","xiatian"){
        public void show(){
            System.out.println("wher summer");
        }
    },
    AUTUMN("autumn","qiutian"){
        public void show(){
            System.out.println("wher summer");
        }
    },
    WINTER("winter","dongtian"){
        public void show(){
            System.out.println("wher spring");
        }
    };
    private final String seasonName;
    private final String seasonDesc;
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
