package cd.edu.gdmec.android.zcr.m2theftguard;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

import cd.edu.gdmec.android.zcr.R;




public class LostFindActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_find);
        startSetup1Activity();
    }

    private void startSetup1Activity() {
        Intent intent = new Intent(LostFindActivity.this,SetUp1Activity.class);
        startActivity(intent);
        finish();
    }

    /*private TextView mSafePhoneTV;
    private RelativeLayout mInterSetupRL;
    private SharedPreferences msharedPrefences;
    private ToggleButton mToggleButton;
    private TextView mProtectStatusTV;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_lost_find);
        msharedPrefences=getSharedPreferences("config",MODE_PRIVATE);
        if(!isSetUp()){
            startSetUp1Activity();
        }
        initView();
    }

    private void initView() {
        TextView mTitleTV=(TextView)findViewById(R.id.tv_title);
        mTitleTV.setText("手机防盗");
        ImageView mLeftImgv=(ImageView)findViewById(R.id.imgv_leftbtn);
        mLeftImgv.setOnClickListener(this);
        mLeftImgv.setImageResource(R.drawable.back);
        findViewById(R.id.rl_titlebar).setBackgroundColor(getResources().getColor(R.color.purple));
        mSafePhoneTV=(TextView)findViewById(R.id.tv_safephone);
        mSafePhoneTV.setText(msharedPrefences.getString("safephone",""));
        mToggleButton=(ToggleButton)findViewById(R.id.togglebtn_lostfind);
        mInterSetupRL=(RelativeLayout)findViewById(R.id.rl_inter_setup_wizard);
        mInterSetupRL.setOnClickListener(this);
        mProtectStatusTV=(TextView)findViewById(R.id.tv_lostfind_protectstauts);
        boolean protecting = msharedPrefences.getBoolean("protecting",true);
        if (protecting){
            mProtectStatusTV.setText("防盗保护已开启");
            mToggleButton.setChecked(true);
        }else{
            mProtectStatusTV.setText("防盗保护没有开启");
            mToggleButton.setChecked(false);
        }
        mToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mProtectStatusTV.setText("防盗保护已开启");
                }else{
                    mProtectStatusTV.setText("防盗保护没有开启");
                }
                SharedPreferences.Editor editor=msharedPrefences.edit();
                editor.putBoolean("protecting",isChecked);
                editor.commit();
            }
        });

    }

    private void startSetUp1Activity() {
        Intent intent = new Intent(LostFindActivity.this,SetUp1Activity.class);
        startActivity(intent);
        finish();
    }

    private boolean isSetUp() {
        return msharedPrefences.getBoolean("isSetUp",false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rl_inter_setup_wizard:
                startSetUp1Activity();
                break;
            case R.id.imgv_leftbtn:
                finish();
                break;
        }

    }*/
}
