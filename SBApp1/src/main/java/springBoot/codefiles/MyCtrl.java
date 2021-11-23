package springBoot.codefiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyCtrl 
{
	@Autowired
	MyService myService;
	@RequestMapping("/greet")
	public String sayHello()
	{
		return myService.sayHello();
	}	
}
