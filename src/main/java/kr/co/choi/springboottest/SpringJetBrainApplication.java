package kr.co.choi.springboottest;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2

@SpringBootApplication
public class SpringJetBrainApplication {
    public static void main(String[] args) {
        log.debug("시작점입니다.");
        SpringApplication.run(SpringJetBrainApplication.class, args);
    }



}
