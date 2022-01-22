package hello.typeconverter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    void helloV1(HttpServletRequest request) {
        // 문자로 조회된다.
        String data = request.getParameter("data");
        int result = Integer.parseInt(data);
        log.info("result == {} ", result);
    }

    @GetMapping("/hello-v2")
    void helloV2(@RequestParam Integer data) {
        log.info("data == {} ", data);
    }
}
