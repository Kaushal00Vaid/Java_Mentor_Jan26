
package OPPE;

import java.util.*;

class Company {
    private Map<String, ArrayList<Integer>> employeeMap;

    public Company(Map<String, ArrayList<Integer>> e) {
        employeeMap = e;
    }

    public Map<String, ArrayList<Integer>> getEmployeeMap() {
        return employeeMap;
    }
}

public class Test1 {
    // Define the method getFinalList() here
    public static ArrayList<String> getFinalList(Company c) {
        // iterate through the map
        // check if the value (arraylist) and every month >= 10
        Map<String, ArrayList<Integer>> hash = c.getEmployeeMap();
        ArrayList<String> ans = new ArrayList<>();

        for (String name : hash.keySet()) {
            ArrayList<Integer> curr = hash.get(name);

            boolean flag = true;
            for (Integer currMonthSales : curr) {
                if (currMonthSales < 10) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans.add(name);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<Integer>> emap = new LinkedHashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> targetList = new ArrayList<Integer>();
            String name = sc.next();
            for (int j = 0; j < 3; j++) {
                targetList.add(sc.nextInt());
            }
            emap.put(name, targetList);
        }
        Company c = new Company(emap);
        System.out.println(getFinalList(c));
    }
}