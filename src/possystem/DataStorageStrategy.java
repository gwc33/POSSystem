/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package possystem;

/**
 *
 * @author gcorcoran
 */
public interface DataStorageStrategy {
    
    public String getUPC(int a);
    
    public Product getProductInfo(int a);
    
}