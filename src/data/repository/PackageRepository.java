package data.repository;

import data.model.Package;
import data.model.TrackingInformation;

import java.util.List;

public interface PackageRepository {
    Package save (Package aPackage);
    Package findByID(int ID);
    void delete (Package aPackage);
    void delete (int ID);
    long count();
    List<Package> findAll();
}
