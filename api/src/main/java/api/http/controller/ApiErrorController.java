package api.http.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import  org.springframework.http.HttpStatus;

@Controller
public class ApiErrorController implements ErrorController  {

    @RequestMapping(value = "/error", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> handleError() {
			return new ResponseEntity<String>("{\"error\": \"Not Found\"}", HttpStatus.OK);
    }
}
