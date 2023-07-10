package services;

import Dto.CreateTrafficInformation;
import data.model.TrackingInformation;

public class TrackingInformationImpl implements TrackingInformationService {


    @Override
    public void createTrackingInformation(CreateTrafficInformation request) {
        TrackingInformation trackingInformation = new TrackingInformation();
        trackingInformation.setUpdateID(request.);
   }
}


