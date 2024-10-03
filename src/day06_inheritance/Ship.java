package day06_inheritance;

public class Ship {
// (superclass)
	public class Ship1 {
	 public   void floatOnWater() {
	        System.out.println("Floating on water...");
	    }
	}

	// Ship class (subclass)
	public class ship extends Ship1 {
	   public void sail() {
	        System.out.println("Sailing...");
	    }
	}


	public class Cruiseship extends Ship {
	 public   void Passengers() {
	        System.out.println(" passengers...");
	    }
	}

	public class CargoShip extends Ship {
	  public  void transportGoods() {
	        System.out.println("Transporting goods...");
	    }

		
	}
	}

