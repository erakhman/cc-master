package campingceria.master.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import campingceria.master.entity.User;
import campingceria.master.service.UserService;

@RestController
@ComponentScan(basePackages= {"campingceria.master.service"})
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/user/login")
	ResponseEntity<HashMap<String,Object>> login(@RequestBody User param) {
		System.out.println(param);
		User user = userService.selectOne(param);
		if (user != null) {
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("user", user);
			return ResponseEntity.ok(map);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/user/list")
	ResponseEntity<HashMap<String,Object>> list() {
		List<User> list = userService.selectList(new User());
		if (list != null) {
			HashMap<String,Object> map = new HashMap<String,Object>();
			map.put("users", list);
			return ResponseEntity.ok(map);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}

}
