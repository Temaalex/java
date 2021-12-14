package ru.javabegin.oop;

//Задача 1
//        Ура, нас взяли в проект по разработке игры Half-Life 3. Нам предстоит реализовать один из модулей игры.
//
//        1) Придумайте класс, который будет описывать текущий прогресс игрока в игре.
//        2) Создайте методы, которые будут сохранять прогресс, а также подгружать его, когда пользователь продолжает игру.


import java.io.Serializable;
import java.util.Arrays;

public class progressGame implements Serializable {

    private  static final long serialVersionUID = 1515151L;

    public String nickName;
    public int level;
    private transient String [] listOfWeapons;
    private transient int HitPoints;


    public progressGame(String nickName, int level, Object[] listOfWeapons, int hitPoints) {
        this.nickName = nickName;
        this.level = level;
        this.listOfWeapons = (String[]) listOfWeapons;
        HitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return "progressGame{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", listOfWeapons=" + Arrays.toString(listOfWeapons) +
                ", HitPoints=" + HitPoints +
                '}';
    }
}
