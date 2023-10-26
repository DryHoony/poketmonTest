package Hoony.poketmonTest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@Slf4j
public class Controller {

    @GetMapping("/nextPage")
    public String nextPage() {
        return "nextPage";
    }

}
