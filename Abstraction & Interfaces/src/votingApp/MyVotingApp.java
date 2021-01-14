package votingApp;



public class MyVotingApp {

	public static void main(String[] args) {
		Kid k=new Kid();
		Adult a=new Adult();
		k.registerUser();
		k.reqVotingNo();
		
		a.registerUser();
		a.reqVotingNo();

	}

}
