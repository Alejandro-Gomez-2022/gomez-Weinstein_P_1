package com.revature.repositories;

import com.revature.models.Profile;
import com.revature.util.ResourceNotFoundException;
import java.util.List;
import static orm.ORM.*;

public class ProfileRepoDBImpl implements ProfileRepo {

    @Override
    public Profile addProfile(Profile p) {
        return addData(p);
    }

    @Override
    public Profile getProfile(int id) {
        return getDataById(id);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return getAllData("profiles");
    }

    @Override
    public Profile updateProfile(Profile change) {
        return updateData(change);
    }

    @Override
    public Profile deleteProfile(int id) throws ResourceNotFoundException {
        return deleteData(id);
    }

}