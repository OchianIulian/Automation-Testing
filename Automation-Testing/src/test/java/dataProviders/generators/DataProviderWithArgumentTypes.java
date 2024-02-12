package dataProviders.generators;

import java.util.ArrayList;
import java.util.List;

public enum DataProviderWithArgumentTypes {
    CALCULATOR_ARGS(initList("int", "int", "operator", "int" )),
    BROWSER_ARGS(initList("browser_type", "bool"));


    private final List<Object> dataList;

    DataProviderWithArgumentTypes(List<Object> dataList) {
        this.dataList = dataList;
    }

    public List<Object> getDataList(){
        return dataList;
    }

    public static List<Object> initList(Object... args){
        List<Object> list = new ArrayList<>();
        for (Object element: args){
            list.add(element);
        }
        return list;
    }
}
