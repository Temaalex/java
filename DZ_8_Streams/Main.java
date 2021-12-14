package ru.javabegin.oop;

//Задача 1
//        Ура, нас взяли в проект по разработке игры Half-Life 3. Нам предстоит реализовать один из модулей игры.
//
//        1) Придумайте класс, который будет описывать текущий прогресс игрока в игре.
//        2) Создайте методы, которые будут сохранять прогресс, а также подгружать его, когда пользователь продолжает игру.

import java.io.*;

public class Main {
    private static final  String SAVE_PROGRESS_GAME = "date.txt";
    public static void main(String[] args) {
        progressGame date = new progressGame("Mike007",5, new String[]{"weapon", "rpg"}, 100);// Здесь запишите Ваш прогресс в игре

        if(args.length == 0){
            System.out.println("Сохраните прогресс игры!");
            return;
        }
        switch (args[0]){
            case "save": final progressGame myProgress = date;
                saveProgress(myProgress);
                System.out.println("Прогресс игры сохранен.");
                break;
            case "load": final progressGame progress = loadProgress();
                System.out.println("Добро пожаловать в игру "+date.nickName+"!");
                System.out.println("Уровень Вашего персоонажа в игре "+date.level+".");
                //System.out.println(progress);

                break;
            default:System.out.println("Сохраните прогресс игры!");
        }


    }
    private static boolean saveProgress(progressGame progress){
        try (FileOutputStream fos = new FileOutputStream(SAVE_PROGRESS_GAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(progress);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    private static progressGame loadProgress(){
        try (FileInputStream fis = new FileInputStream(SAVE_PROGRESS_GAME);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            final Object obj = ois.readObject();
            progressGame result =(progressGame) obj;
            return result;
        } catch (IOException | ClassNotFoundException e){
            return null;
        }
    }
}

