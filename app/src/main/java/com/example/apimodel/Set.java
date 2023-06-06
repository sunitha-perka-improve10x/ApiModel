package com.example.apimodel;

import com.google.gson.annotations.SerializedName;

public class Set {
    @SerializedName("shop_money")
    private Money shopMoney;
    @SerializedName("presentment_money")
    private Money presentmentMoney;
}
