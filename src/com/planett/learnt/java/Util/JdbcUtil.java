package com.planett.learnt.java.Util;

import com.planett.learnt.java.main.User;

import javax.management.relation.Role;
import java.sql.*;
import java.util.UUID;

public class JdbcUtil {
    private static final String DRIVER_CLASS ="com.mysql.cj.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3306/bbs?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
    private static final String USERNAME ="root";
    private static final String PASSWORD ="123456";
    static Connection conn = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet rs = null;
    /*
     * 加载数据库
     * */
    public static void loadClass() throws ClassNotFoundException{
        Class.forName(DRIVER_CLASS);
    }

    /*
     * 获取数据库连接
     * */
    public static Connection getConn() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }


    /*
     * 关闭连接并释放资源
     * */
    public static void close(ResultSet rs, Statement stat, Connection conn){
        try {
            if (rs != null){
                rs.close();
            }
            if (stat != null){
                stat.close();
            }
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    * 检查数据唯一性
    * */
    public static boolean validate(String userName,String userPassword) throws ClassNotFoundException, SQLException {
            JdbcUtil.loadClass();
            conn = JdbcUtil.getConn();
            System.out.println(conn);
            String sql = "select * from t_user where userName = ? and userPassword = ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, userPassword);

            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            return false;
    }

    /*
    * 增添数据
    * */
    public static boolean register(String userName,String userPassword,String phoneNumber) throws ClassNotFoundException, SQLException {
        JdbcUtil.loadClass();
        conn = JdbcUtil.getConn();
        System.out.println(conn);
        String uid = UUID.randomUUID().toString();
        String sql= "insert into t_user(uid,userName,userPassword,phoneNumber,createTime,rid) values(?,?,?,?,now(),?)";
        preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,uid);
        preparedStatement.setString(2,userName);
        preparedStatement.setString(3,userPassword);
        preparedStatement.setString(4,phoneNumber);
        preparedStatement.setString(5,"1");
        System.out.println(preparedStatement);
        if (preparedStatement.executeUpdate()==1){
            return true;
        }
        return false;
    }
}
