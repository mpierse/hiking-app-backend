package hikinghelper;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TrailService {

    private RestTemplate restTemplate = new RestTemplate();
    private String baseURl = "https://www.hikingproject.com/data/";

    public ResponseEntity<String> getWilmingtonTrails(){
        return restTemplate.getForEntity(baseURl + "get-trails?lat=39.7447&lon=-75.5484&key=" + "HIKING_PROJECT_KEY"
                , String.class);
    }

}
