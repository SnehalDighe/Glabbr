import java.util.*;

interface Observer {
       public void update(String networkChanged);
}

interface Subject {
       public void registerObserver(Observer observer);

       public void removeObserver(Observer observer);

       public void notifyObservers();
}

class Network implements Subject {
       private ArrayList<Observer> observers = new ArrayList<Observer>();
      // private String type;
       private String networkChanged;
      

       public Network(String networkChanged) {
              //this.type = type;
              this.networkChanged = networkChanged;
             
       }

       public String getNetworkChanged() {
              return networkChanged;
       }

       public void setNetworkChanged(String networkChanged) {
              this.networkChanged = networkChanged;
              notifyObservers();
       }

      
       

       @Override
       public void registerObserver(Observer observer) {
              observers.add(observer);

       }

       @Override
       public void removeObserver(Observer observer) {
              observers.remove(observer);

       }

       @Override
       public void notifyObservers() {
              for (Observer ob : observers) {
                     System.out.println("Notifying Observers on change in networkChanged in Mobile");
                     ob.update(this.networkChanged);
              }

       }

}

class WIFI implements Observer {
       @Override
       public void update(String networkChanged) {
              System.out.println("WIFI: Mobile is connected with WIFI"
                           + networkChanged);
       }
}

class MobileNetwork implements Observer {
       @Override
       public void update(String networkChanged) {
              System.out.println("MOBILE Network: Mobile is connected with MOBILE Network "
                + networkChanged);
       }
}




class NoConnection implements Observer {
       @Override
       public void update(String networkChanged) {
              System.out.println("NoConnection: No Network Connection"
                + networkChanged);
       }
}

public class ObserverDemo1 {

       public static void main(String args[]) {
              // this will maintain all Network information
              WIFI wf = new WIFI();
              MobileNetwork mn = new MobileNetwork();

              Network network = new Network("WIFI");
              network.registerObserver(wf);
              network.registerObserver(mn);
              network.setNetworkChanged("MobileNetwork");

       }
}


