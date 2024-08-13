package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "test1";
        String name2 = "test2";

        System.out.println("name = " + name);

        log.trace("trace log={}, log={}", name, name2);
        log.debug("debug log={}, log={}", name, name2);
        log.info("info log" + name);
        log.info("info log={}", name);
        log.warn(name2);
        log.error("error log={}, log={}", name, name2);

        return "ok";

    }

}
