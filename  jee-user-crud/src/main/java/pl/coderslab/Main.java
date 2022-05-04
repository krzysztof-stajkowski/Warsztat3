package pl.coderslab;

import pl.coderslab.entity.User;

public class Main {
    public static void main(String[] args) {

///////////  CREATE NEW USER
//        User newUser = new User();                    //1. Tworzymy nowy obiekt klasy User.
//        newUser.setUsername("Marek");                  //2. Wypełniamy odpowiednie dane, używając setterów.
//        newUser.setEmail("mar@wp.pl");                          //2. Wypełniamy odpowiednie dane, używając setterów.
//        newUser.setPassword("gronk123");                  //2. Wypełniamy odpowiednie dane, używając setterów.
//
//        pl.coderslab.UserDao.UserDao userDao = new pl.coderslab.UserDao.UserDao();              //3. Tworzymy nowy obiekt klasy UserDao.
//        userDao.create(newUser);                      //4. Używamy metody create, żeby zapisać dane użytkownika do bazy.

/////////////  DELETE USER
//        pl.coderslab.UserDao.UserDao.delete(4);

/////////////  READ USER INFO
//        System.out.println(pl.coderslab.UserDao.UserDao.read(7));

/////////////  UPDATE
//        User userToUpdate = pl.coderslab.UserDao.UserDao.read(5);
//        userToUpdate.setUsername("Józek");
//        userToUpdate.setEmail("email@buziaczek.com");
//        userToUpdate.setPassword("trzasło");
//        pl.coderslab.UserDao.UserDao.update(userToUpdate);

///////////////  FIND ALL
        User[] all = pl.coderslab.UserDao.UserDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }
    }
}
