package assessment.p.com;
import java.util.ArrayList;

public class Airport {
	Address address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers;
	
	public boolean addFlight(Flight flight)
	{
		ArrayList<Flight> list=new ArrayList<>();
		if(flights.contains(flight))
		{
			return false;
		}
		else
		{
		  list.add(flight);
		   return true;
		}
		
	}
	
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination)
	{
		ArrayList<Flight> emptylist=new ArrayList<>();
		ArrayList<Flight> list=new ArrayList<>();
		for(Flight flight:flights)
		{
			if(flight.source.equals(source) && flight.destination.equals(destination))
			{
					list.add(flight);
					return list;
			}
		}
			return emptylist;
		
		
		
			
		
		
	}
	public void bookTicket(String flightId,Traveller traveller)
	
	{
		ArrayList<Traveller> tlist=new ArrayList<>();
		for(Flight flight:flights)
		    {if(flight.getId().equals(flightId))
		        {
			if(flight.getAvailableSeats()>0)
			{
				System.out.println("Ticket booked");
				tlist.add(traveller);
			
			    
			}
			else
				System.out.println("no seats available");
		      }
		
			
		}
		
		
	}
	
	

}
