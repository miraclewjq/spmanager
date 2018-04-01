package com.wu.spmanager.service;

import com.wu.spmanager.dto.UserRolesVO;
import com.wu.spmanager.dto.UserSearchDTO;
import com.wu.spmanager.model.User;
import com.wu.spmanager.utils.PageDataResult;

public interface UserService {

    /**
     * 分页查询用户列表
     * @param page
     * @param limit
     * @return
     */
    PageDataResult getUsers(UserSearchDTO userSearch, int page, int limit);

    /**
     *	设置用户【新增或更新】
     * @param user
     * @param roleIds
     * @return
     */
    String setUser(User user, String roleIds);

    /**
     * 设置用户是否工作（0：正常；1，冻结）
     * @param id
     * @param isJob
     * @return
     */
    int setJobUser(Integer id, Integer isJob);

    /**
     * 删除用户
     * @param id
     * @param isDel
     * @return
     */
    int setDelUser(Integer id, Integer isDel);

    /**
     * 查询用户数据
     * @param id
     * @return
     */
    UserRolesVO getUserAndRoles(Integer id);

    /**
     * 根据手机号查询用户数据
     * @param mobile
     * @return
     */
    User findUserByMobile(String mobile);

    /**
     * 修改用户手机号
     * @param id
     * @param password
     * @return
     */
    int updatePwd(Integer id, String password);

    /**
     * 锁定用户
     * @param id
     * @param isLock  0:解锁；1：锁定
     * @return
     */
    int setUserLockNum(Integer id, int isLock);

    /**  
     * @Description :  根据用户名查找
     * @Author : wujingqian   
     * @Date : 2018/4/1 2:26  
     */ 
    User findUserByName(String username);
}
