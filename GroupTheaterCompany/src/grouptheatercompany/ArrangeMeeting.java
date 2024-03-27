
package grouptheatercompany;

import java.io.Serializable;
import java.time.LocalDate;


//public class ArrangeMeeting 
public class ArrangeMeeting implements Serializable{
    
    private String title;
    private LocalDate mdate;
    private String dayTime;
    private String mtype;
    private String venue ;
    private String name;

    public ArrangeMeeting(String title, LocalDate mdate, String dayTime, String mtype, String venue, String name) {
        this.title = title;
        this.mdate = mdate;
        this.dayTime = dayTime;
        this.mtype = mtype;
        this.venue = venue;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getMdate() {
        return mdate;
    }

    public void setMdate(LocalDate mdate) {
        this.mdate = mdate;
    }

    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArrangeMeeting{" + "title=" + title + ", mdate=" + mdate + ", dayTime=" + dayTime + ", mtype=" + mtype + ", venue=" + venue + ", name=" + name + '}'+"\n";
    }

  
   
    
    
    
    
    
    
    
    
    
}
