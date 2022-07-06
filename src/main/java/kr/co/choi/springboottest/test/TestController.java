package kr.co.choi.springboottest.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class TestController {

    @RequestMapping(value="parameter", method= RequestMethod.GET)
    public ResponseEntity<String> getParameterTest(@RequestParam(value="msg")String msg ){
        log.debug("안녕하세요");
        return new ResponseEntity<>(msg +"메시지입니다.", HttpStatus.OK);

    }

}
