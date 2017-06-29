package com.dcoker.networkdetial;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import com.dcoker.networkdetial.api.urlConfig;
import com.dcoker.networkdetial.api.userInfoService;
import com.dcoker.networkdetial.entry.User;
import com.dcoker.networkdetial.netUtils.retorfitHelper;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {

   @BindView(R.id.btn_get)
   public Button btn_get;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }



    @OnClick(R.id.btn_get)
    public void get(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(urlConfig.baseurl)
                .client(retorfitHelper.mokHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        userInfoService userInfoService = retrofit.create(userInfoService.class);
        Call<User> call = userInfoService.getUserinfo(10064,2);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

               // Toast.makeText(MainActivity.this, "onResponse", Toast.LENGTH_LONG).show();
                User c  = response.body();
                Toast.makeText(MainActivity.this, c.toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this,"---fail------",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showResult(String methodtype, String Result){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("result : "+methodtype);
        builder.setMessage(Result);
        builder.create().show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
