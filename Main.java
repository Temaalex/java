class Main{  
  public static void main(String args[]){
    // Переменные пользоателя
    String name = "Артемий";
    Byte age = 30;
    String work = "инженер-конструктор";
    String [] hobbies = {"бег", "программирование", "чтение книг"};
    
    //Вывод информации о пользователе 
    System.out.print("Привет, меня завут "+name);
    System.out.println(" и мне "+age+" лет.");
    System.out.println("Работаю по професии " +work+".");
    System.out.print("У меня есть несколько хобби такие как: ");
    for(int i = 0; i<hobbies.length; i++){
      if(i == hobbies.length-2){
        System.out.print(hobbies[i]);
      } else if(i == hobbies.length-1){
        System.out.print(" и "+hobbies[i]+".");
      } else {
        System.out.print(hobbies[i]+", ");
      }                                              
    }
  }  
}  
