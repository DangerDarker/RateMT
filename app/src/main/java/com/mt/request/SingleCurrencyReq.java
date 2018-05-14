package com.mt.request;


import com.rate.mt.ratemt.Config;

import org.json.JSONObject;

public class SingleCurrencyReq extends IRequest {
    private String Currency;
    public SingleCurrencyReq(String Currency){
        super();
        this.Currency = Currency;
        request.add(Config.Currency , Currency);
        request.add("appkey" ,Config.appKey);
    }
    @Override
    public String getResultURL(){
        return Config.URL_SINGLE;
    }

    public JSONObject getJSONObiect(){
        return request.getJSON(getResultURL() , true );
    }
}
