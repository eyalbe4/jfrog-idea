package com.jfrog.xray.client;

import com.jfrog.xray.client.services.binarymanagers.BinaryManagers;
import com.jfrog.xray.client.services.summary.Summary;
import com.jfrog.xray.client.services.system.System;

import java.io.Closeable;
import java.io.Serializable;

public interface Xray extends Closeable, Serializable {

    System system();

    BinaryManagers binaryManagers();

    Summary summary();

    @Override
    void close();
}