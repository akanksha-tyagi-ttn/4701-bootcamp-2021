package com.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrdersTest {
    private Orders orderObj;
    OrdersTest(){
        orderObj = new Orders();
    }
    // -------------price--------
    @Test
    void checkPriceMismatch_True(){
        //given
        orderObj.setPrice(55.23);
        //when
        double price = orderObj.getPrice();
        //then
        assertEquals(price, 55.441);
    }
    @Test
    void checkPriceMismatch_False(){
        //given
        orderObj.setPrice(55.23);
        //when
        double price = orderObj.getPrice();
        //then
        assertEquals(price, 55.23);
    }
    @Test
    void setPrice(){
        Orders returnObj = orderObj.setPrice(26.55);
        assertSame(returnObj, orderObj);
    }

//----------price with tax----------
    @Test
    void checkPriceWithTax_MismatchTrue(){
        //given
        orderObj.setPriceWithTex(55.23);
        //when
        double priceWithTex = orderObj.getPriceWithTex();
        //then
        assertEquals(priceWithTex, 55.30);
    }

    @Test
    void checkPriceWithTax_MismatchFalse(){
        //given
        orderObj.setPriceWithTex(55.23);
        //when
        double priceWithTex = orderObj.getPriceWithTex();
        //then
        assertEquals(priceWithTex, 55.23);
    }

    @Test
    void setPriceWithTax() {
        Orders returnObj = orderObj.setPriceWithTex(26.55);
        assertSame(returnObj, orderObj);
    }

//-------------quantity----------------
    @Test
    void checkQuantity_MismatchTrue(){
        //given
        orderObj.setQuantity(5);
        //when
        int quantity = orderObj.getQuantity();
        //then
        assertEquals(quantity, 10);
    }

    @Test
    void checkQuantity_MismatchFalse(){
        //given
        orderObj.setQuantity(5);
        //when
        int quantity = orderObj.getQuantity();
        //then
        assertEquals(quantity, 5);
    }
    @Test
    void setQuantity(){
        Orders returnObj = orderObj.setQuantity(2);
        assertSame(returnObj, orderObj);
    }

//------------name--------------
    @Test
    void checkItemName_MismatchTrue(){
        //given
        orderObj.setItemName("Iphone");
        //when
        String itemName = orderObj.getItemName();
        //then
        assertEquals(itemName, "Television");
    }
    @Test
    void checkItemName_MismatchFalse(){
        //given
        orderObj.setItemName("Television");
        //when
        String itemName = orderObj.getItemName();
        //then
        assertEquals(itemName, "Television");
    }

    @Test
    void setItemName(){
        Orders returnObj = orderObj.setItemName("apple");
        assertSame(returnObj, orderObj);
    }

}