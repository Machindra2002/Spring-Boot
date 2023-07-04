package mypackage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.model.*;
import mypackage.repository.*;
import java.util.*;

@Service
public class StateCityService {

	@Autowired StateRepository staterepo;
	@Autowired CityRepository cityrepo;
	
	public State AddStateCityData(State st) {
		State s= new State(0, st.getState_name(), null);
		State std = staterepo.save(s);
		
		for(City c : st.getCities()) {
			City ct = new City(0, c.getCity_name(), std);
			cityrepo.save(ct);
		}
		return std;
	}
	
	public List<State> GetStates(){
		return staterepo.findAll();
	}
	
	
}
