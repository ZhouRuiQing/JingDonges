package com.bwie.jingdong.mvp.model.utils;


import com.bwie.jingdong.mvp.model.bean.CartsBean;
import com.bwie.jingdong.mvp.model.bean.HomeBean;
import com.bwie.jingdong.mvp.model.bean.ProductCatagory;
import com.bwie.jingdong.mvp.model.bean.UiBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("product/searchProducts")
    Observable<UiBean> getdata(@Query("keywords") String keywords, @Query("page") int page, @Query("sort") String sort);
    @GET("home/getHome")
    Observable<HomeBean> gethome();
    @GET("product/getProductCatagory")
    Observable<ProductCatagory> getProduct(@Query("cid") String cid);

    @GET("product/getCarts")
    Observable<CartsBean> getCarts(@Query("uid") String uid);

}
