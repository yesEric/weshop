package cn.petech.infrastructure.persistence.hibernate;

import cn.petech.domain.model.user.User;
import cn.petech.domain.model.user.UserRepository;
import cn.petech.domain.model.user.UsernameNotFoundException;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public class UserHibernateRepository extends GenericHibernateRepository<User,String> implements UserRepository {

    public UserHibernateRepository() {
        super(User.class);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException{
        List<User> users=getSession().createCriteria(User.class).add(Restrictions.eq("username",username)).list();
        if(users==null || users.isEmpty()){
            throw  new UsernameNotFoundException("User ["+username+"] not found...");
        }
        return users.get(0);
    }

}
