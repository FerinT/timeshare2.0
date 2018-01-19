package com.timeshare.dataaccess.user;

import com.timeshare.domain.user.User;

/**
 * Created by tayfer01 on 1/18/2018.
 */
public interface UserRepository {

    void insertUser(User user);

    User getUser();
}
