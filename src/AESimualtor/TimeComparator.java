package AESimualtor;
import java.util.Comparator;

public class TimeComparator implements Comparator<EntityPatient>
{
    @Override
    public int compare(EntityPatient x, EntityPatient y)
    {
            if (x.getTime() < y.getTime())
            {
                return -1;
            }
            if (x.getTime() > y.getTime())
            {
                return 1;
            }
            return 0;
        

    }
}