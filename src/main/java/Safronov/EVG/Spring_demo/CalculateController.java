package Safronov.EVG.Spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String start() {
        return calculateService.start();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculateService.summa(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculateService.minus(num1, num2);
    }

    @GetMapping(path = "multiply")
    public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculateService.multiply(num1, num2);
    }

    @GetMapping(path = "divide")
    public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculateService.divide(num1, num2);
    }
}
