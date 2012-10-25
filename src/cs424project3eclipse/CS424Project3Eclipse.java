package cs424project3eclipse;

import controlP5.ControlP5;
import processing.core.*;

public class CS424Project3Eclipse extends PApplet {

	// Wall Size constants
	final static int WALLWIDTH = 8160;
	final static int WALLHEIGHT = 2304;
	int appDisplayWidth, appDisplayHeight;
	public static int scaleFactor;
	
	PImage bgImage;
	ControlP5 cp5;
	LayoutGraph graph;
	
	// UI elements pos, size
	float graphX, graphY, graphHeight, graphWidth;
	
	boolean displayOnWall;
	
	public void setup() {
	
	  scaleFactor = 1; // 1 for widescreen monitors and 6 for the wall
	  appDisplayWidth = WALLWIDTH / 6;
	  appDisplayHeight = WALLHEIGHT / 6;
	  size(scaleFactor * appDisplayWidth, scaleFactor * appDisplayHeight, JAVA2D);
	  
	  cp5 = new ControlP5(this);
	  
	  // Init BG image
	  bgImage = loadImage("bg.jpg");
	  bgImage.resize(appDisplayWidth * scaleFactor, appDisplayHeight * scaleFactor);
	  background(bgImage);
	  
	  // Initialize GUI elements size and positions
	  graphX = scaleFactor * 100;
	  graphY = scaleFactor * 70;
	  graphWidth = (scaleFactor * (appDisplayWidth - 300)) - (graphX);
	  graphHeight = (scaleFactor * (appDisplayHeight - 140)) - (graphY);
	  
	  // init UI elements 
	  initGraph();
	}
	
	public void initGraph() {
		graph = new LayoutGraph(this, graphX, graphY, graphHeight, graphWidth);
	}
	
	public void draw() {
	  background(bgImage);
	  graph.draw();
	}
}
