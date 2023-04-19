package JavaStudy.src.ch13dao.client.web;

import JavaStudy.src.ch13dao.domain.userinfo.UserInfo;
import JavaStudy.src.ch13dao.domain.userinfo.dao.UserInfoDao;
import JavaStudy.src.ch13dao.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import JavaStudy.src.ch13dao.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");
        System.out.println("dbType = " + dbType);

        UserInfo userInfo = new UserInfo();

        userInfo.setUserId("user01");
        userInfo.setPasswd("!@DSA");
        userInfo.setUserName("Dong");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }else  if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println(" not support " );
        }
        if(userInfoDao != null) {
            userInfoDao.insertUserInfo(userInfo);
            userInfoDao.deleteUserInfo(userInfo);
            userInfoDao.updateUserInfo(userInfo);
        }
    }
}
