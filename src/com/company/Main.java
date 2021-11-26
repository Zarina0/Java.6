package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setHealth(700);
        boss.setDamage(50);

        System.out.println("Босс:" + boss.info() );

        Skeleton skeleton=new Skeleton();
        skeleton.setHealth(100);
        skeleton.setDamage(30);
        skeleton.setGetNumberOfArrows(5);
        System.out.println("Скелет:"+skeleton.info());


        Skeleton skeleton1= new Skeleton();
        skeleton1.setHealth(120);
        skeleton1.setDamage(20);
        skeleton.setGetNumberOfArrows(2);
        System.out.println("Скелет1:" +skeleton.info());
    }


}
