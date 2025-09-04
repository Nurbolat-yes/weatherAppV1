package by.nurbolat.weatherappv1.controller;


import by.nurbolat.weatherappv1.database.repository.UserRepository;
import by.nurbolat.weatherappv1.dto.UserDto;
import by.nurbolat.weatherappv1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/registration")
    public String getRegistrationPage(){
        return "html/registration";
    }

    @PostMapping("/registration")
    public String registration(Model model, @ModelAttribute("registration") UserDto userDto){
        System.out.println(userDto);

        //if something went wrong
        if (false){
            return "redirect:/registration";
        }
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String getLoginPage(){

        return "html/login";
    }
}
