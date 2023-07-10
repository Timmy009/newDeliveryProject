package data.repository;

import data.model.TrackingInformation;

import java.util.List;

public interface TrackingInformationRepository {
    TrackingInformation save (TrackingInformation trackingInformation);
    TrackingInformation findByID(int ID);
    void delete (TrackingInformation trackingInformation);
    void delete (int ID);
    long count();


}
