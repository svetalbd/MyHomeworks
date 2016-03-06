package com.goit.javaonline.module3;

import java.util.List;

/**
 * Created by Сергей on 06.03.2016.
 */
public class Directory {
    private List<AudioFile> audioFiles;
    private List<ImageFile> imageFiles;
    private List<TextFile> textFiles;

    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public List<ImageFile> getImageFiles() {
        return imageFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public void setImageFiles(List<ImageFile> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public void setTextFileFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }
}

