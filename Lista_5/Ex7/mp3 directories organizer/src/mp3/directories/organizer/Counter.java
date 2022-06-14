/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp3.directories.organizer;

/**
 *
 * @author ryan.souza
 */
public class Counter {
    private String count = "0000";
    private int counter;

    public void countUp() {
        if (9999 < counter) {
            return;
        }
        counter ++;
        count = String.format("%04d", counter);
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
    
}
