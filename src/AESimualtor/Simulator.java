package AESimualtor;
class Simulator extends AbstractSimulator {
  
	double time;
    double now() {
        return time;
    }
    void doAllEvents() {
        Event e;
        while ( (e= (Event) events.removeFirst()) != null) {
            time = e.time;
            e.execute(this);
        }
    }
}




