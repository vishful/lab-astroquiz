package utility;

import model.User;
public class EligibilityCheck extends BasicEligibility implements EligibilityInterface {
	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub		
		if(checkUser(user)&&checkQuizAnswer("points")) {
			return true;
		}
		else 
			return false;
	}


	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		
		if((18<=age && age<=35)&&(155<=height && height<=178)&&(55<=weight&&weight<=90)&&(country.equals("ProGrad")))
			return true;
		else
			return false;
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int p=Integer.parseInt(points);
		if(p>80) {
			return true;
		}
		else
			return false;
		}
}