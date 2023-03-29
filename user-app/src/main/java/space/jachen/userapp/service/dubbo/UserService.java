package space.jachen.userapp.service.dubbo;

import org.springframework.beans.BeanUtils;
import org.apache.dubbo.config.annotation.Service;
import space.jachen.userapi.VO.UserVO;
import space.jachen.userapi.service.IUserService;
import space.jachen.userapp.domain.TUser;
import space.jachen.userapp.mapper.TUserMapper;

import javax.annotation.Resource;

/**
 * @author daniel
 */
@Service
public class UserService implements IUserService {

    @Resource
    private TUserMapper userMapper;


    /**
     * 通过用户id获取用户信息接口
     * @param id
     * @return
     */
    @Override
    public UserVO getUserById(int id){
        TUser tUser = userMapper.selectByPrimaryKey(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(tUser,userVO);
        return userVO;
    }


}
