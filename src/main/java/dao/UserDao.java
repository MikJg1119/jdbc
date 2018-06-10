package dao;

import config.Database;
import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private Database database = new Database();


    // save
    public User save(User user) throws SQLException {
    //insert do dB
        Connection connection = database.getConnection(); //pobranie połączenia

        String sql = "INSERT INTO user (first_name, last_name, email) " +
                "VALUES (" + user.getFirstName() +" "; //zapytanie

    }
    // update
    public void update(User user)throws SQLException{
        Connection connection = database.getConnection();



    }
    // delete
    public void delete (int id)throws SQLException{
        Connection connection = database.getConnection();

    }
    // findById
    public User findById (int id)throws SQLException{
        Connection connection = database.getConnection();


    }

    // findAll
    public List<User> findAll()throws SQLException{
        Connection connection = database.getConnection();


    }


}
