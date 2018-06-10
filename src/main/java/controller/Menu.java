package controller;

import dao.UserDao;
import model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private String choice;
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.wyswietlMenu();
    }


    public void wyswietlMenu() throws SQLException {
        UserDao userDao = new UserDao();
        Scanner s = new Scanner(System.in);
        choice=s.nextLine();
        switch (choice) {
            case "1": {
                userDao.save(new User("Ja", "On", "kkkkkk"));
                break;
            }
            case "2":{
                userDao.update(new User("Ja", "Ty", "Adelphin@3R.de", 29));
            break;
            }
            case "3":{
                userDao.delete(36);
                break;
            }
            case "4":{
                userDao.findById(29);
                System.out.println();
                break;
            }
            case "5":{
                userDao.findAll();
                break;
            }

        }

        }

}
