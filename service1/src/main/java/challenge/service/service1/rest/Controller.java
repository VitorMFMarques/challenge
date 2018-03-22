package challenge.service.service1.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @RequestMapping("/")
    public List<String> findAll() {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        return list;
    }
}
