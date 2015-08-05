package cn.petech.application;


import cn.petech.domain.model.user.User;
import cn.petech.domain.model.user.UsernameNotFoundException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
public class UserServiceTest extends BaseManagerTestCase {

@Autowired
    private UserService userService;

    @Test
    public void testSaveUser(){

        User user=userService.createNewUser("Eric","aaa");
        assertNotNull(user.getId());
    }

    @Test
    public void testLoadUserByUsername() throws Exception{
        User user= null;
        try {
            user = userService.loadUserByUsername("user");
        } catch (UsernameNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(user.getId(),"-1");
    }
}
