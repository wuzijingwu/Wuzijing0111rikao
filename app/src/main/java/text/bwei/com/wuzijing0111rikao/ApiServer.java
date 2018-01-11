package text.bwei.com.wuzijing0111rikao;

import retrofit2.http.GET;
import rx.Observable;
import text.bwei.com.wuzijing0111rikao.bean.BannerBean;


public interface ApiServer {
//    @POST
//    Observable<SignUpBean> getsup(@Url String url, @QueryMap Map<String,String> map);
//    @POST
//    Observable<LoginBean> getlg(@Url String url, @QueryMap Map<String,String> map);
//
//    @GET("product/getCatagory")
//    Observable<OneBean> getonedata();

    @GET("ad/getAd")
    Observable<BannerBean> getbanner();

//    @POST
//    Observable<TwoBean> getRight(@Url String url, @QueryMap Map<String,Integer> map);
//
//    @POST
//    Observable<GoodBean> getgood(@Url String url, @QueryMap Map<String,Integer> map);
//
//    @POST
//    Observable<DetailsBean> getdetail(@Url String url, @QueryMap Map<String,String> map);
//
//    @POST
//    Observable<AddBean> getAdd(@Url String url, @QueryMap Map<String,String> map);

//    @POST
//    Observable<ShopCarBean> getcatlist(@Url String url, @QueryMap Map<String,String> map);
//
//    @POST
//    Observable<DeleteBean> getdeta(@Url String url, @QueryMap Map<String,String> map);
}