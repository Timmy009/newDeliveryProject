package data.repository;

import data.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImpl implements PackageRepository{

    private List<Package> packages = new ArrayList<>();

    @Override
    public Package save(Package aPackage) {

       if (userExist(aPackage)) {
         return   saveNew(aPackage);
       }
       return update(aPackage);
    }


    private Package update (Package aPackage) {
        int packageID = aPackage.getPackageID();
        packages.set(packageID, aPackage);
        return aPackage;
    }

    private Package saveNew (Package aPackage) {
        aPackage.setPackageID(generatePackageID());
        packages.add(aPackage);
        return aPackage;

    }


    private int generatePackageID () {
        return packages.size();
    }
    private boolean userExist(Package aPackage) {
        boolean userExist =  aPackage.getPackageID()==0;
        return !userExist;
    }

    @Override
    public Package findByID(int ID) {
        return null;
    }

    @Override
    public void delete(Package aPackage) {

    }

    @Override
    public void delete(int ID) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public List<Package> findAll() {
        return null;
    }
}
