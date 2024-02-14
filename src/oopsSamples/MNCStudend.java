package oopsSamples;

public class MNCStudend extends Student implements AttendanceInterface,ScoreInterface {

		public MNCStudend(String strName) {
			name=strName;
		}
		public void goToClass() {
			System.out.println("Go to the class after collecting Evals..");
		}
		@Override
		public int calculateScore() {
			// TODO Auto-generated method stub
			return 40;
		}
		@Override
		public int calculateAtten() {
			// TODO Auto-generated method stub
			return 30;
		}

	}


