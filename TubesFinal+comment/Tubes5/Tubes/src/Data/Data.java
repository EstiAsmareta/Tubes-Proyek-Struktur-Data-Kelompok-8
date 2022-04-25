/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author ASUS TUF
 */
public class Data {
    
    public LinkListData head = null;
    //algoritma menghubungkan node yang diterima
    public void tambahData(LinkListData obj){
        if (head != null) {
            obj.next = head;
            head = obj;
        } else {
            head = obj;
        }
    } 
}