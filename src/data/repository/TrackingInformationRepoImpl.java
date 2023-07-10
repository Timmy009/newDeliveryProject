package data.repository;

import data.model.TrackingInformation;

import java.util.ArrayList;
import java.util.List;

public class TrackingInformationImpl implements TrackingInformationRepository{

    private List<TrackingInformation> trackingInformationList = new ArrayList<>();
    private int count = 1;

    @Override
    public TrackingInformation save(TrackingInformation trackingInformation) {
        if (!userExist(trackingInformation)) {
            saveNew(trackingInformation);
        }

        else {update(trackingInformation);}
        return trackingInformation;
    }


    private void update (TrackingInformation trackingInformation)  {
        trackingInformationList.set(trackingInformationList.indexOf(trackingInformation), trackingInformation);

    }

    private void saveNew (TrackingInformation trackingInformation)  {
        trackingInformation.setUpdateID(generateUpdateID());
        trackingInformationList.add(trackingInformation);


    }


    private int generateUpdateID () {
        return count++;
    }
    private boolean userExist (TrackingInformation trackingInformation)  {
        boolean userExist =  trackingInformation.getUpdateID()==0;
        return !userExist;
    }
    @Override
    public TrackingInformation findByID(int ID) {
       for (TrackingInformation trackingInformation : trackingInformationList) {
           if (trackingInformation.getUpdateID()== ID) {
               return trackingInformation;
           }
       }
       return null;
    }

    @Override
    public void delete(TrackingInformation trackingInformation) {
        trackingInformationList.remove(trackingInformation);
    }

    @Override
    public void delete(int ID) {
        for (TrackingInformation trackingInformation : trackingInformationList) {
            if (trackingInformation.getUpdateID()== ID) {
                trackingInformationList.remove(trackingInformation);
            }
        }
    }

    @Override
    public List<TrackingInformation> findUpdateByPackageID(int packageID) {
        List<TrackingInformation> trackingInformations = new ArrayList<>();

        for (TrackingInformation trackingInformation : trackingInformationList) {
            if (trackingInformation.getPackageID()==packageID) {
                trackingInformations.add(trackingInformation);
            }
        }
        return trackingInformations;
    }

    @Override
    public long count() {
        return trackingInformationList.size();
    }
}
