package com.meiju;

public class TestSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());
    }
}
class Season{
    private final String seasonName;
    private final String seasonDesc;
    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    public static final Season SPRING = new Season("spring","chuntian");
    public static final Season SUMMER = new Season("summer","xiatian");
    public static final Season AUTUMN = new Season("autumn","qiutian");
    public static final Season WINtER = new Season("winter","dongtian");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
    public  void show(){
        System.out.println("zheshiyigejijie");
    }
}
