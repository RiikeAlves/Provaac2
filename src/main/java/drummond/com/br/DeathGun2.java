package drummond.com.br;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class DeathGun2 {
	@RequestMapping(value="/api1/{valor1}",method= RequestMethod.GET)
	public String api2(@PathVariable Integer valor1){

	     if(valor1%2 == 0)
	     {
	    	 return "par";
	     }
	     else
	     {
	    	return "impar";
	     }
	    
	}
}
