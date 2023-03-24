package edu.javacourse.register.rest;

import edu.javacourse.register.business.MarriageManager;
import edu.javacourse.register.view.MarriageRequest;
import edu.javacourse.register.view.MarriageResponse;

public class MarriageController {
    private MarriageManager marriageManager;
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        MarmarriageManager.findMarriageCertificate(request);
    }
}
