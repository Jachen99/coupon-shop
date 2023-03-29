package space.jachen.userapi.service;

import space.jachen.userapi.VO.UserVO;

/**
 * @author jachen
 */
public interface IUserService {


    /**
     * 通过用户id获取用户信息接口
     * @param id
     * @return
     */
    public UserVO getUserById(int id);
}
