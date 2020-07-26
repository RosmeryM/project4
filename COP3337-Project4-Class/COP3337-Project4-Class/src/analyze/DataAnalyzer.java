package analyze;

import app.ExecutionInfo;
import java.util.ArrayList;

public class DataAnalyzer {
    
    private ArrayList<ExecutionInfo> data; 

    public DataAnalyzer() {
        
        data = new ArrayList<>();
    }

    public ArrayList<ExecutionInfo> getData() {
        return data;
    }
    
    public void findGrowthRate(){
          System.out.println("");
          
         System.out.println("-------------------------------------------------");
         System.out.println("Data Analyzer Growth Rate");
         System.out.println("-------------------------------------------------");
         
         // your output format must match mine
         // look at the video for see the out format
         // the exponent value is e^x = total method class   
         // you need to find the x... do not over think it use the Math class 
         // YOU PUT YOUR CODE HERE
         
         String indexCol = "Index:";
         String fibValueCol = "FibValue:";
         String callsCol = "Calls:";
         String exponentCol = "Exponent:";
         
          for (ExecutionInfo exInfo : data) {
              System.out.printf("%-7s %-4d %-10s %-9d %-8s %-10.0f %-8s %7.3f %n",
                      indexCol, exInfo.getFibIndex(),
                      fibValueCol, exInfo.getFibValue(),
                      callsCol, exInfo.getTotalMethodCalls(),
                      exponentCol, Math.log(exInfo.getTotalMethodCalls()) / Math.log(Math.E));
        }

    }
    
}// end class
