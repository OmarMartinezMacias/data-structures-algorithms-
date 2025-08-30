package com.company.Models;

import java.util.List;

public class StreamList {

    private List<String> streamList;

    public StreamList(List<String> streamList){
        this.streamList = streamList;
    }

    public List<String> getStreamList(){
        return streamList;
    }

    public void setStreamList(List<String> streamList){
        this.streamList = streamList;
    }
}
