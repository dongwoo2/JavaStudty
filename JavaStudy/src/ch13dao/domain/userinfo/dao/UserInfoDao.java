package JavaStudy.src.ch13dao.domain.userinfo.dao;

import JavaStudy.src.ch13dao.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
