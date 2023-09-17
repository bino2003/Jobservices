package com.example.jobservices;

import android.app.job.JobParameters;
import android.app.job.JobService;

public class jopsrvices extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {

        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

}
