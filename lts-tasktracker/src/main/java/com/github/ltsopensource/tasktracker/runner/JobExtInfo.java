package com.github.ltsopensource.tasktracker.runner;

import com.github.ltsopensource.core.domain.JobType;

/**
 * @author Robert HG (254963746@qq.com) on 4/2/16.
 */
public class JobExtInfo {

    // 已经重试的次数 (用户不要设置)
    private int retryTimes = 0;

    /**
     * 已经重复的次数, (用户不要设置)
     */
    private int repeatedCount = 0;
    /**
     * 是否是重试
     */
    private boolean retry;
    /**
     * 任务类型
     */
    private JobType jobType;

    public boolean isRetry() {
        return retry;
    }

    public void setRetry(boolean retry) {
        this.retry = retry;
    }

    public int getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(int retryTimes) {
        this.retryTimes = retryTimes;
    }

    public int getRepeatedCount() {
        return repeatedCount;
    }

    public void setRepeatedCount(int repeatedCount) {
        this.repeatedCount = repeatedCount;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }
}
