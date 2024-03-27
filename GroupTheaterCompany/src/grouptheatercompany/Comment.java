/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grouptheatercompany;

import java.io.Serializable;

/**
 *
 * @author JOY SAHA
 */
public class Comment implements Serializable{
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" + "comment=" + comment + '}';
    }
    public String toViewComment() {
        return   comment + "\n";
    }
    
    
}
