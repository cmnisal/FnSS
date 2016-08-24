/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.functions;

import fnss.functions.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import pos.interfaces.Stock;
import static pos.interfaces.Stock.items;
import pos.model.Item;

/**
 *
 * @author Nisal
 */
public class ItemController {

    public static Map<String, Item> getAllItemsFromDB() throws SQLException {
        ResultSet rs = DB.getDbCon().query("SELECT * FROM stock");
        while (rs.next()) {
            Item item = new Item();
            item.setCode(rs.getString("itemCode"));
            item.setName(rs.getString("itemName"));
            item.setCost(rs.getDouble("BuyingPrice"));
            item.setQuantity(rs.getDouble("Quantity"));
            item.setSelling_price(rs.getDouble("SellingPrice"));
            item.setSub_cat(rs.getString("SubCategory"));
            Stock.items.put(item.getCode(), item);
        }
        return Stock.items;

    }

    public static ArrayList<Item> searchItem(String keyword) {
        if (keyword == null || "".equals(keyword)) {
            return  new ArrayList<>(items.values());
        } else {
            ArrayList<Item> itemList = new ArrayList<>();
            Stock.items.keySet().stream().filter((String key) -> {
                return Stock.items.get(key).getName().toLowerCase().contains((CharSequence) keyword.toLowerCase()) || Stock.items.get(key).getCode().contains((CharSequence) keyword.toLowerCase());
            }).forEach((key) -> {
                itemList.add(items.get(key));
            });
            return itemList;
        }
    }

    private static Item getItemByItemCodeFromDB(String itemCode) throws SQLException {
        Item item = new Item();
        ResultSet rs = DB.getDbCon().query("SELECT * FROM stock WHERE itemCode = ");
        if (rs.next()) {
            item.setCode(rs.getString("itemCode"));
            item.setName(rs.getString("itemName"));
            item.setCost(rs.getDouble("cost"));
            item.setQuantity(rs.getDouble("qty"));
            item.setSelling_price(rs.getDouble("sellingPrice"));
            item.setSub_cat(rs.getString("subCat"));
        }
        return item;
    }

}
