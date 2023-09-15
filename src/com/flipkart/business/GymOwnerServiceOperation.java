package com.flipkart.business;

import java.util.*;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.Slots;
import com.flipkart.dao.GymOwnerDAOImplementation;
import com.flipkart.dao.GymOwnerDaoInterface;


public class GymOwnerServiceOperation implements GymOwnerService{

	HashMap<String,GymOwner> gymOwners = new HashMap();
	GymOwnerDaoInterface gymOwnerDaoInterface = new GymOwnerDAOImplementation();
	Scanner obj = new Scanner(System.in);
	int id = 0;
	@Override
	public void addGymWithSlots(Gym gym) {
		gymOwnerDaoInterface.addGym(gym);
	}
	@Override
	public List<Gym> viewMyGyms(String userId){
		return gymOwnerDaoInterface.viewGymSlots(userId);
	}

	@Override
	public boolean validateLogin(String email, String password) {
		if(gymOwnerDaoInterface.validateLogin(email,password)) return true;
        return false;
    }

	@Override
	public void createGymOwner(GymOwner gymOwner){
		gymOwnerDaoInterface.newGymOwner(gymOwner);

	}

}
