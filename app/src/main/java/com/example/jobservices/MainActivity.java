package com.example.jobservices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;

import com.example.jobservices.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    JobInfo info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ComponentName componentName=new ComponentName(getApplicationContext(),jopsrvices.class);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            info=new JobInfo.Builder(100,componentName)
//                .setPeriodic(15*60*1000,5*60*1000)
                    .setMinimumLatency(5000)
                    .build();
        }
        JobScheduler jobScheduler= (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);
jobScheduler.schedule(info);

    }
}