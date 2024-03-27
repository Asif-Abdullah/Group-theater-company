/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

/**
 *
 * @author User
 */
public class CostumeDetail {
    private String performerName, performerType;
    private int performerId;

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public String getPerformerType() {
        return performerType;
    }

    public void setPerformerType(String performerType) {
        this.performerType = performerType;
    }

    public int getPerformerId() {
        return performerId;
    }

    public void setPerformerId(int performerId) {
        this.performerId = performerId;
    }

    public CostumeDetail(String performerName, String performerType, int performerId) {
        this.performerName = performerName;
        this.performerType = performerType;
        this.performerId = performerId;
    }

    @Override
    public String toString() {
        return "CostumeDetail{" + "performerName=" + performerName + ", performerType=" + performerType + ", performerId=" + performerId + '}';
    }

   
}
