/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.interfaces;

import java.util.HashMap;
import java.util.Map;
import pos.model.Item;

/**
 *
 * @author Nisal
 */
public interface Stock {
    public Map<String,Item> items = new HashMap<>();
}
