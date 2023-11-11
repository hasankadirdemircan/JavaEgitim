package com.example.resttemplate.controller;

import com.example.resttemplate.model.ExchangeRate;
import com.google.gson.Gson;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    //TODO:
    // 1 - Service Katmanı koy
    // 2 - şuan her şey get() methodu içerisinde Clean Code prensibine göre methodlara ayır.
    // 3 - ExchangeRate modelde TRY olarak geçiyor daha anlamlı isim koy. Çünkü euro to dollar da olabilir
    // 4 - Bir Enum olsun hangi para biriminden hangisine çevireceğimizi biz seçelim. 2-3 tane olsa yeter.
    // Örnek : EURO TO DOLLAR, DOLLAR TO TRY, EURO TO TRY yani bunlar senin Controller'ına parametre olarak dışardan gelecek(UI veya POSTMAN veya SWAGGER)
    // 5- README.md dosyası oluşturun orada açıklayınız.
    // 6- UI yazmak isteyenlere + puan
    // 7 - Swagger nasıl entegre edilir? araştırıp yapana + puan
    // NOT: Kod yazarken ExchangeRate modeli değişmesi gerekirse(yeni field ekleme, güncelleme vs..) korkmadan yapınız.
    @GetMapping
    public void get() {
        String key = "fca_live_aEoMOKb3MrP2xjA7jo3XBPADA3LeifuYmsEBVpVY";
        //https://app.freecurrencyapi.com/latest-requests
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("apikey", key);
        String currencyUri = "https://api.freecurrencyapi.com/v1/latest?currencies={currency}";
        Map<String, Object> map = new HashMap<>();
        map.put("currency", "TRY");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(currencyUri,  HttpMethod.GET, entity, String.class, map);
        Gson gson = new Gson();
        ExchangeRate exchangeRate = gson.fromJson(response.getBody(), ExchangeRate.class);

        System.out.println(exchangeRate.getData().getTRY());
    }

    @GetMapping("/test")
    public String hello() {
        return "hello";
    }
}
