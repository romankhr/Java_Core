package HomeWorkPlane;

public class ManagePlane implements GoDOWN, GoUP,  GoLeft, GoRight {
	MoveRand move=new MoveRand();
	@Override
	public void goRight() {		
		System.out.println("Plane is mowing right on " + move.move() + " meters.");		
	}

	@Override
	public void goLeft() {
		System.out.println("Plane is mowing left on " + move.move() + " meters.");		
	}

	@Override
	public void goUp() {
		System.out.println("Plane is mowing up on " + move.move() + " meters.");	
	}

	@Override
	public void goDown() {
		System.out.println("Plane is mowing down on " + move.move() + " meters.");		
	}
	
}
