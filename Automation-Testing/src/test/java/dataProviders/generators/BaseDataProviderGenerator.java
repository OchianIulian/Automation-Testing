package dataProviders.generators;

import java.util.List;
import java.util.Random;

/**
 * BaseDataProviderGenerator is a class that is used for generating DataProviders for different type of data providers
 * It can be updated easily just by adding other ifs
 */
public class BaseDataProviderGenerator {

    /**
     * Generate data for tests
     * @param numOfSets - how much tests will be done
     * @param dataProviderType - describes the type of data will be generated
     * @return
     */
    public static Object[][] generateTestData(int numOfSets, DataProviderWithArgumentTypes dataProviderType){
        Random random = new Random();
        List<Object> argumentsList;
        argumentsList = dataProviderType.getDataList();
        Object[][] object = new Object[numOfSets][argumentsList.size()];
        for(int i=0; i<numOfSets; ++i){
            for(int j=0; j<argumentsList.size(); ++j){
                if (argumentsList.get(j).equals("int")) {
                    object[i][j] = random.nextInt(1000);
                } else if(argumentsList.get(j).equals("float")) {
                    object[i][j] = random.nextDouble(1000);
                } else if(argumentsList.get(j).equals("browser_type")){
                    int browserNr = random.nextInt(3);
                    switch (browserNr) {
                        case 0:
                            object[i][j] = "chrome";
                            break;
                        case 1:
                            object[i][j] = "safari";
                            break;
                        case 2:
                            object[i][j] = "firefox";
                            break;
                    }
                } else if(argumentsList.get(j).equals("bool")){
                    int boolNr = random.nextInt(2);
                    switch (boolNr) {
                        case 0:
                            object[i][j] = false;
                            break;
                        case 1:
                            object[i][j] = true;
                            break;
                    }
                } else if (argumentsList.get(j).equals("operator")) {
                    int operatorNumber = random.nextInt(5);
                    switch (operatorNumber) {
                        case 0:
                            object[i][j] = "+";
                            break;
                        case 1:
                            object[i][j] = "-";
                            break;
                        case 2:
                            object[i][j] = "*";
                            break;
                        case 3:
                            object[i][j] = "/";
                            break;
                        case 4:
                            object[i][j] = "SQRT";
                            break;
                    }
                }  else {
                    throw new IllegalStateException("Unexpected argument type" + argumentsList.get(j));
                }
            }
        }
        return object;
    }

    public static void main(String[] args){
        Object[][] object = generateTestData(4, DataProviderWithArgumentTypes.CALCULATOR_ARGS);
        for(int i=0; i<4; ++i){
            for(int j =0 ; j<4; ++j){
                System.out.print(object[i][j] + " ");
            }
            System.out.println();
        }

        Object[][] object1 = generateTestData(4, DataProviderWithArgumentTypes.BROWSER_ARGS);
        for(int i=0; i<4; ++i){
            for(int j =0 ; j<2; ++j){
                System.out.print(object1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
