package pe.edu.utp.dentalservice.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by SARA SHEENA on 04/03/2017.
 */
public class IdentityCard {

    private int id;
    private String description;

    public IdentityCard(){}

    public IdentityCard(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public IdentityCard setId(int id){
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public IdentityCard setDescription(String description) {
        this.description = description;
        return this;
    }

    public static IdentityCard build(ResultSet resultSet) {
        try {
            return new IdentityCard(resultSet.getInt("id"),
                    resultSet.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}