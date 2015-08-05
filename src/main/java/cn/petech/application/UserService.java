package cn.petech.application;


import cn.petech.domain.common.GenericRepository;
import cn.petech.domain.model.user.User;
import cn.petech.domain.model.user.UsernameNotFoundException;

public interface UserService {
    public User createNewUser(String username,String password);
    User loadUserByUsername(String username) throws UsernameNotFoundException;
}
