package day08;

public class IfElseWithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 45;
		
		if (temperature>=65) {
			System.out.println("It is a nice day! Lets code java");
		}else {
			
			System.out.println("Stay home and code java");
		}
		
		//2 int variables, teamAScore, teamBScore
		//put a condition.check if teamA won. "Team A won."
		//else "Team B won or it was a draw"
		// Go Teams!
		
		
		int teamAScore = 18;
		int teamBScore = 45;
		
		if(teamAScore>teamBScore) {
			System.out.println("Team A won."
					+ "Go Team A!"
					+ "");
			
		}else {
			if (teamBScore>=teamAScore) {
				System.out.println("Team B won ot it was a draw.Go Teams");
			}
			
		}

	}

}
