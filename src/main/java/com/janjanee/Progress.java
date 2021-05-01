package com.janjanee;

import java.time.Duration;

public class Progress {

    private Duration studyDuration;

    private boolean finished;

    public Progress() {
        this.studyDuration = Duration.ofHours(3);
    }

    public Duration getStudyDuration() {
        return studyDuration;
    }

    public void setStudyDuration(Duration studyDuration) {
        this.studyDuration = studyDuration;
    }
}
