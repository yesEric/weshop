package cn.petech.application.impl;


import cn.petech.application.UserService;
import cn.petech.domain.model.user.User;
import cn.petech.domain.model.user.UserRepository;
import cn.petech.domain.model.user.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User createNewUser(String username, String password) {
        User user=new User(username,password);
        user= userRepository.save(user);
        return user;
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.loadUserByUsername(username);
    }
}
