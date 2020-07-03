package utility;

import model.User;
public class EligibilityCheck extends BasicEligibility implements EligibilityInterface {
	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub		
		if(checkUser(user)) {
			return true;
		}
		else 
			return false;
	}
	
	int age;
	int height;
	int weight;
	String country;

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if(((18<=user.getAge(age)) && (user.getAge(age)>=35))){
			if(((155<=user.getHeight(height)) && (user.getHeight(height)<=170))) {
				if(((55<= user.getWeight(weight)) && (user.getWeight(weight)<=90))) {
					if(user.getCountry(country)=="ProGrad") {
						return true;
					}
				}
			}
		}
		else
			return false;
		return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int p=Integer.parseInt(points);
		if(p<=20) {
			return false;
		}
		else
			return true;
		}
}