package Gameboard;

import Roads.Path;

import Geom.Point3D;

/**
 * This class represents a Pacman Character
 * with Geographic point
 *
 */
public class Pacman extends Character {
	private Path path;  // Path eating
	private int numOfFruits; // sum of eating fruits
	private double radius,weightOfFruit, orientation; 

	public Pacman(Point3D point, int id, double speed, double radius) {
		super(point,id,speed);
		this.radius = radius; // Radius eaten
		this.path = new Path(point,-1); // When created a new path first point it's point of pacman
		this.weightOfFruit = 0; // Sum of all fruits weight eaten
		this.numOfFruits = 0; 
		this.orientation = 0; // Start orientation with 0 angle
		
	}
	
	/**
	 * Copy constructor
	 * @param p
	 */
	public Pacman(Pacman p)
	{
		super(p.getPoint(),p.getId(),p.getAttribute());
		this.radius = p.getRadius();
		this.path = p.getPath();
	}
	
	public void addToPath(Fruit f, double currentTime)
	{
		this.path.add(f,currentTime);
	}
	
	public int getNumOfFruits() {
		return numOfFruits;
	}
	public double getWeightOfFruit() {
		return weightOfFruit;
	}
	public void addWeightOfFruit(double weightOfFruit) {
		this.weightOfFruit = this.weightOfFruit+weightOfFruit;
		this.numOfFruits=this.numOfFruits+1;
	}
	
	public void setNumOfFruits(int numOfFruits) {
		this.numOfFruits = numOfFruits;
	}
	public void setWeightOfFruit(double weightOfFruit) {
		this.weightOfFruit = weightOfFruit;
	}
	public Path getPath() {
		return path;
	}
	public void setPath() {
		this.path = new Path(getPoint(),-1);
	}

	public double getRadius() {
		return radius;
	}
	
	public double getOrien() {
		return orientation;
	}
	
	public void setOrien(double angle) {
		orientation = angle;
	}

}
