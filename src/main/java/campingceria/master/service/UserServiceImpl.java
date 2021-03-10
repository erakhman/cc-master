package campingceria.master.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campingceria.master.entity.User;
import campingceria.master.mapper.UserMapper;

@Service("userService")
@MapperScan(basePackages= {"campingceria.master.mapper"})
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectOne(User param) {
		User user = null;
		try {
			user = userMapper.selectOne(param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<User> selectList(User param) {
		List<User> users = null;
		try {
			users = userMapper.selectList(param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

}
