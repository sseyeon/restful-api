package demo.api.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class firstController {
    private final demo.api.restapi.service.firstService firstService;
    @GetMapping("/first")
    public Map<String, Object> firstController() {
        return firstService.getFirstData();
    }
}
