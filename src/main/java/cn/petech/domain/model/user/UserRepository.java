package cn.petech.domain.model.user;


import cn.petech.domain.common.GenericRepository;

import java.util.List;

public interface UserRepository extends GenericRepository<User,String>{

    User loadUserByUsername(String username) throws UsernameNotFoundException;





}
