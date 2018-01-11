package text.bwei.com.wuzijing0111rikao.model;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import text.bwei.com.wuzijing0111rikao.ApiServer;
import text.bwei.com.wuzijing0111rikao.BannerConstract;
import text.bwei.com.wuzijing0111rikao.bean.BannerBean;


public class BannerModel implements BannerConstract.IBannerModel {
    @Override
    public void RequestData(String url, final BannerConstract.OnBannerRequest onBannerRequest) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiServer apiServer = retrofit.create(ApiServer.class);
        Observable<BannerBean> getbanner = apiServer.getbanner();
        getbanner.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BannerBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        onBannerRequest.OnError(e.getMessage().toString());
                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {
                        onBannerRequest.OnSuccess(bannerBean);
                    }
                });
    }
}