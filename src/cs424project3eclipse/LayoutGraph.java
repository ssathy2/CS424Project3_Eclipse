package cs424project3eclipse;

import cs424project3eclipse.CS424Project3Eclipse;

public class LayoutGraph {
	/* Class file to draw labels and controllers associated witht he line graph */
	
	float gPlotX1, gPlotX2, gPlotY1, gPlotY2;
	CS424Project3Eclipse parent;
	
	public LayoutGraph(CS424Project3Eclipse p, float x, float y, float h, float w) {
		parent = p;
		gPlotX1 = x;
		gPlotX2 = x + w;
		gPlotY1 = y;
		gPlotY2 = y + h;
	}
	
	private void drawGLayout() {
		parent.strokeWeight(6);
		parent.stroke(0);
		parent.fill(250, 180);
		parent.rect(gPlotX1, gPlotY1, gPlotX2, gPlotY2, parent.scaleFactor * 6);
	}
	
	public void draw() {
		drawGLayout();
	}

}
