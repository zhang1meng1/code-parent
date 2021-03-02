package com.code;
import com.code.bean.Table;
import com.code.handler.MvcHandler;
import com.code.handler.TableHandler;

import java.util.ArrayList;
import java.util.List;
public class Genterator {

    public static void main(String args[]) throws Exception {
        TableHandler tableHandler = new TableHandler();
        MvcHandler mvcHandler = new MvcHandler();
        List<Table> tableList = tableHandler.getTables();
        for (Table table : tableList) {
            mvcHandler.executeModule(table);//0k
            mvcHandler.executeMapper(table);//ok
            mvcHandler.executeClazzMapper(table);//ok

        }
    }
}