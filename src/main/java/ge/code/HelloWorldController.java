package ge.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    // need a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTWo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");

        theName = theName.toUpperCase();

        String result = "YP! "+ theName;

        model.addAttribute("message", result);

        return "helloworld";
    }
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();

        String result = "HeyFriend! "+ theName;

        model.addAttribute("message", result);

        return "helloworld";
    }




}
