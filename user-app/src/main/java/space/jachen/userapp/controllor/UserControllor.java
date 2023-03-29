package space.jachen.userapp.controllor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.jachen.userapp.domain.TUser;
import space.jachen.userapp.service.UserService;

import javax.annotation.Resource;

/**
 * @author jachen
 */
@RestController
public class UserControllor {


    @Resource
    private UserService userService;


    /**
     * 通过用户id获取用户信息接口
     * @param id
     * @return
     */  
    @RequestMapping("/getUserById")
    public TUser getUserById(Integer id){
        if(id==null||id==0){
            return new TUser();
        }
        return userService.getUserById(id);
    }

}
