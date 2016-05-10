package AESimualtor;
import java.util.Comparator;

public class ResourceTimeComparator implements Comparator<Resource>
{
    @Override
    public int compare(Resource x, Resource y)
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