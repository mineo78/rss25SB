package fr.univrouen.rss25sb.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @RequestMapping(value = "/testpost", method = RequestMethod.POST,consumes = "application/xml")
    public String postTest(@RequestBody String flux) {
        return ("<result><response>Message reçu : </response>" + flux + "</result>");
    }
    
}
