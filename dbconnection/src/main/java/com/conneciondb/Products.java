package com.conneciondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Products {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String url = "jdbc:mysql://localhost:3306/products";
        String user= "campus2023";
        String password = "campus2023";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            // String createTableSQL = "CREATE TABLE if NOT EXISTS games ("+
            // "id int primary key auto_increment," +
            // " name varchar(50) )";
            // statement.execute(createTableSQL);
            // System.out.println("tabla creada");


            // String insertDataSQL = "INSERT INTO category (name) VALUES ('pintura'),('Herramientas')";
            // statement.executeUpdate(insertDataSQL);
            // System.out.println("categoria registrada");

            // String query = "Select id,name from category";

            // //objeto que se encarga de contener la informacion retornada por el statement
            // ResultSet rs = statement.executeQuery(query);

        //     while (rs.next()) {
        //         int id = rs.getInt("id");
        //         String name = rs.getString("name");
        //         System.out.println("id: "+ id + ", nombre: "+ name);
        //     }
     
        // String updateSQL = "update category set name='Grifos' where id=1";
        // int rowUpdate = statement.executeUpdate(updateSQL);
        // System.out.println("Numero de filas actualizadas" + rowUpdate);

            String deleteSQL = "DELETE FROM category where id=1";
            int rowDelete = statement.executeUpdate(deleteSQL);
            System.out.println("Numero de filas borradas" + rowDelete);
            
        } catch (SQLException e) {
                // TODO: handle exception
                e.printStackTrace();
        }

    }
}