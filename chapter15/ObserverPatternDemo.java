package java2e.chapter15;
import java.util.*;

interface Observer
{
	void update(int updatedValue);
}
class ObserverType1 implements Observer
{
	String nameOfObserver;
	public ObserverType1(String name)
	{
		this.nameOfObserver = name;
	}   
	@Override
	public void update(int updatedValue) 
	{
		System.out.println( nameOfObserver+" has received an alert: Updated myValue in Subject is: "+ updatedValue);
	}
}
class ObserverType2 implements Observer
{
	String nameOfObserver;
	public ObserverType2(String name)
	{
		this.nameOfObserver = name;
	}
	@Override
	public void update(int updatedValue) 
	{
		System.out.println( nameOfObserver+" has received an alert: The current value of myValue in Subject is: "+ updatedValue);
	}
}

interface SubjectInterface
{
	//Use it to register an observer
	void register(Observer anObserver);
	//Use it to unregister an observer
	void unregister(Observer anObserver);
	//Use it to unregister all observers
	void unregisterAll();
	//Use it to notify all registers users(i.e.observers)
	void notifyRegisteredUsers(int notifiedValue);
}
class Subject implements SubjectInterface
{
	private int flag;
	public int getFlag() 
	{
		return flag;
	}
	public void setFlag(int flag) 
	{
		this.flag = flag;
		//Flag value changed. So notify registered users/observers.
		notifyRegisteredUsers(flag);
	}
	List<Observer> observerList = new ArrayList<Observer>();    
	@Override
	public void register(Observer anObserver) {
		observerList.add(anObserver);
		System.out.println("Currently, observerList.size()="+ observerList.size());

	}
	@Override
	public void unregister(Observer anObserver) {
		observerList.remove(anObserver);		
		System.out.println("Currently, observerList.size()="+ observerList.size());
	}
	@Override
	public void unregisterAll() 
	{		
		observerList.clear();	
		//Or, use this
		//observerList.removeAll(observerList);	
		System.out.println("Currently, observerList.size()="+ observerList.size());
	}
	@Override
	public void notifyRegisteredUsers(int updatedValue) 
	{
		for (Observer observer : observerList)
			observer.update(updatedValue);
	}
	
}
public class ObserverPatternDemo {

	public static void main(String[] args) {
		System.out.println(" ***Observer Pattern Demo***\n");
		//We have 3 observers- 2 of them are ObserverType1, 1 of them is of ObserverType2
		Observer myObserver1 = new ObserverType1("Roy");
		Observer myObserver2 = new ObserverType1("Kevin");
		Observer myObserver3 = new ObserverType2("Bose");
		Subject subject = new Subject();
		//Registering the observers-Roy,Kevin,Bose
		System.out.println("+Registering Roy.+");
		subject.register(myObserver1);
		System.out.println("+Registering Kevin.+");
		subject.register(myObserver2);
		System.out.println("+Registering Bose.+");
		subject.register(myObserver3);
		System.out.println(" Setting Flag = 5 ");
		subject.setFlag(5);           
		//Unregistering an observer(Roy))
		System.out.println("-Unregistering Roy-");
		subject.unregister(myObserver1);
		//No notification for Roy this time, as he  is NOT a registered user now.
		System.out.println("\n Setting Flag = 50 ");            
		subject.setFlag(50);
		//Roy is registering himself again
		System.out.println("+Registering Roy again.+");
		subject.register(myObserver1);
		System.out.println("\n Setting Flag = 100 ");
		subject.setFlag(100);
		System.out.println("Now unregistering all observers.");
		//Unregister all observers
		subject.unregisterAll();
		System.out.println("\n Setting Flag = 500 ");
		//At this stage, no one will get the notification from the subject.
		subject.setFlag(500);
		
	}
}



