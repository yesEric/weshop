package cn.petech.domain.model.user;


import cn.petech.domain.common.EntityObject;
import cn.petech.domain.common.EntityObjectSupport;
import cn.petech.domain.common.Identity;

public class User extends EntityObjectSupport<User,String> {

    @Identity
    String id;
    String username;
    String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
