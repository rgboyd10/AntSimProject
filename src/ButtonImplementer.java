public class ButtonImplementer implements SimulationEventListener
{

	@Override
	public void simulationEventOccurred(SimulationEvent simEvent) {
		// TODO Auto-generated method stub
		
		int eventType = simEvent.getEventType();
		 simEvent = new SimulationEvent(this, eventType);
	}
	
}