package springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by bysocket on 07/02/2017.
 */
@Controller
public class test_controller {

    @GetMapping("/aa")
    String string(){

        return "index";
    }



}
