package JavaStudy.src.ch13dao.domain.userinfo.dao.mysql;

import JavaStudy.src.ch13dao.domain.userinfo.UserInfo;
import JavaStudy.src.ch13dao.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("mysqluserInfo = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("mysqluserInfo = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("mysqluserInfo = " + userInfo.getUserId());
    }
}
