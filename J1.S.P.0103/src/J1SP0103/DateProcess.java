/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1SP0103;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DateProcess {

    public int compareDate(Date firstDate, Date secondDate) {
        if (firstDate.equals(secondDate)) {
            return 0;
        } else if (firstDate.after(secondDate)) {
            return 1;
        } else {
            return -1;
        }
    }
}
