package AESimualtor;
class AbstractSimulator {
    OrderedSet events;
    void insert(AbstractEvent e) {
        events.insert(e);
    }
    AbstractEvent cancel(AbstractEvent e)  {
        throw new java.lang.RuntimeException("Method not implemented");
    }
}


