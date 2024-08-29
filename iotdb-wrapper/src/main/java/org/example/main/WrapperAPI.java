package org.example.main;

import org.apache.iotdb.tsfile.file.metadata.enums.TSDataType;
import org.apache.iotdb.tsfile.file.metadata.enums.TSEncoding;
import org.apache.iotdb.tsfile.file.metadata.enums.CompressionType;

public class WrapperAPI {
    private TSDataType tsDataType;
    private TSEncoding tsEncoding;
    private CompressionType compressionType;

    public void exampleAPI() {
        System.out.println(tsDataType);
    }
}