package cn.petech.application;


import cn.petech.domain.common.GenericRepository;
import cn.petech.domain.model.user.User;

public interface UserService {
    public User createNewUser(String username,String password);
}
