/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developer.marvel.com.cliente;

import developer.marvel.com.dto.Root;
import developer.marvel.com.util.Constantes;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ND
 */
@Service
public class ClienteEjercicio1 {

    public ResponseEntity<Root> invoca() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        HttpEntity<String> request = new HttpEntity<>(headers);
        return restTemplate.
                exchange(Constantes.URL_SERVICIO, HttpMethod.GET, request, Root.class,Constantes.TS,Constantes.KEY,Constantes.HASH);
        
    }
    public ResponseEntity<Root> invoca(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        HttpEntity<String> request = new HttpEntity<>(headers);
        String url= Constantes.URL_SERVICIO.concat("/").concat(String.valueOf(id));
        return restTemplate.
                exchange(Constantes.URL_SERVICIO, HttpMethod.GET, request, Root.class,Constantes.TS,Constantes.KEY,Constantes.HASH);
        
    }
}
