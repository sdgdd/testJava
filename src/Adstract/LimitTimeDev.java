package Adstract;

import java.util.Date;

public interface LimitTimeDev {
    long getLeftTime();

    boolean isExpired();

    void setStartAndGap(Date date,long gapTime);

}
