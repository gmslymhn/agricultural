package tyut.agricultural.framework.service;


import tyut.agricultural.common.domain.R;
import tyut.agricultural.framework.domain.dto.AddUserDto;
import tyut.agricultural.framework.domain.dto.LoginDto;
import tyut.agricultural.framework.domain.dto.VerifyRegisterDto;
import tyut.agricultural.framework.domain.dto.param.UserParam;

/**
 * @ClassName: IUserService
 * @Description:
 * @Author: gmslymhn
 * @CreateTime: 2024-05-19 17:39
 * @Version: 1.0
 **/
public interface IUserService {

    R login(LoginDto loginDto);

    R logoutUser();

    R addUser(AddUserDto addUserDto);

    R verifyRegister(VerifyRegisterDto verifyRegister);

    R getUserList(UserParam userParam);

    R getUserMsgById(Integer userId);

    R delectUserById(Integer userId);
}
