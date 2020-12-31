package com.miasol.service;

import com.miasol.pojo.History;

import java.util.List;

public interface HistoryService {
    int insHistory(History history);

    int updHistory(History history);

    History selHistoryByName(int uid,String videoName);

    List<History> selHistoryByUid(int uid);
}
