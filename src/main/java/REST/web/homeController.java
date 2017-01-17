package REST.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yangbingyan on 17-1-17.
 */
@Controller
@RequestMapping("/")
public class homeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
