package hikinghelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrailController {

    @Autowired
    TrailService trailService;

    @RequestMapping("trails/wilmington")
    public ResponseEntity<Trail> getTrail(){
        return trailService.getWilmingtonTrails();
    }

}
