package abstractchallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mindwarrior on 12/9/2016.
 */
public interface ISaveable {
    List write();
    void read(List<String> savedValues);
}
