package defaultt;

public class Array2d {

	public static void main(String[] args) {
		
		String[][] cars = {
					{"Mustang","Corvete","Silverado"},
					{"Ferrari","Lambo","Bugatti"},
					{"Chevron","Tesla","Toyota"}
				};
//		
//		cars[0][0] = "Mustang";
//		cars[0][1] = "Corvete";
//		cars[0][2] = "Silverado";
//		cars[1][0] = "Ferrari";
//		cars[1][1] = "Lambo";
//		cars[1][2] = "Bugatti";
//		cars[2][0] = "Chevron";
//		cars[2][1] = "Tesla";
//		cars[2][2] = "Toyota";
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0;j <cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
		

	}

}
