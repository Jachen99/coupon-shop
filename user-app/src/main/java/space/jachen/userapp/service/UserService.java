package space.jachen.userapp.service;

import org.springframework.stereotype.Service;
import space.jachen.userapp.domain.TUser;
import space.jachen.userapp.mapper.TUserMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author daniel
 */
@Service
public class UserService {

    @Resource
    private TUserMapper userMapper;


    /**
     * 通过用户id获取用户信息接口
     * @param id
     * @return
     */
    public TUser getUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }


}
