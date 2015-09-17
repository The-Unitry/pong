package eu.theunitry.pong.timer;

import javax.swing.Timer;

import eu.theunitry.pong.gui.GraphicsPanel;

public class GameTimer
{
	private Timer timer;
	private GraphicsPanel graphicsPanel;
	private static final int TICK = 5;
	
	public GameTimer(GraphicsPanel panel)
	{
		this.graphicsPanel = panel;
		this.timer = new Timer(TICK, graphicsPanel);
		this.start();
	}
	
	public void start()
	{
		this.timer.start();
	}
	
}
