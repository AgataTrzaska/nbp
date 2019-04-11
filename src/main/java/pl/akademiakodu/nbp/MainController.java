package pl.akademiakodu.nbp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @GetMapping("/exchangerates/{currencyCode}/today")
    public CurrencyModel index(@PathVariable String currencyCode) {

        String url = "http://api.nbp.pl/api/exchangerates/rates/c/"+currencyCode+"/today/?format=json";


        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel currencyModel = restTemplate.getForObject(url, CurrencyModel.class);

        return currencyModel;
    }


}
