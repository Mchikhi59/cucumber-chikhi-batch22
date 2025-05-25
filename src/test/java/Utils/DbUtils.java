package Utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {
    public  static List<Map<String,String>>fetchData(String query) throws SQLException {
        /*String dbUrl = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName = "syntax_hrm";
        String password = "syntaxhrm123";*/
        String dbUrl = ConfigReader.read("dbUrl");
        String userName =ConfigReader.read("dbUserName");
        String password = ConfigReader.read("dbPassword");

        List<Map<String,String>> tableData = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(dbUrl, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            )
        {ResultSetMetaData metaData = resultSet.getMetaData();

            while (resultSet.next()){
                Map<String,String> rowMap = new LinkedHashMap<>();
                for (int i = 1; i <= metaData.getColumnCount() ; i++) {
                    String key = metaData.getColumnLabel(i);
                    String value =resultSet.getString(i);
                    rowMap.put(key,value);

                }
                tableData.add(rowMap);
            }
        } catch (Exception e){
            e.printStackTrace();

        }


        return tableData;

    }
}
