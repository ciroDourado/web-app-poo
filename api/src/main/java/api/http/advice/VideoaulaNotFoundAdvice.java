package api.http.advice;
import api.http.exception.VideoaulaNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class VideoaulaNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(VideoaulaNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String videoaulaNotFoundHandler(VideoaulaNotFoundException ex) {
    return ex.getMessage();
  }
}
