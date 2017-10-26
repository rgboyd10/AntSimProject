import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Sim implements ActionListener
{
	Timer timer = new Timer(0, null);
	public static void main(String[] args)
	{
	
		AntSimGUI gui = new AntSimGUI();
		ColonyView colony = new ColonyView(27, 27);
		gui.initGUI(colony);

		ColonyNodeView[][] nodeArray = new ColonyNodeView[27][27];
		ColonyNodeView nodeView = new ColonyNodeView(); // not currently being used
			
		for(int x = 0; x < 27; x++)
		{
			for(int y = 0; y < 27; y++)
			{
				
				colony.addColonyNodeView(nodeArray[x][y], x, y);
	
			}
		}
		
		//add action for Normal button on GUI to trigger the filling of the array and showing it


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//if the queen dies, invoke the stop method of the 
		
	}
	
	public void start()
	{
		
	}
	
	public void singleTurnOnly()
	{
		
	}
}