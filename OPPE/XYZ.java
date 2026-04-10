package OPPE;

import java.util.*;

class ApiResponse {
    public int statusCode;
    public int count;

    ApiResponse(int x, int y) {
        statusCode = x;
        count = y;
    }
}

public class XYZ {
    public static void main(String[] args) {

        List<ApiResponse> list = new ArrayList<>();

        list.add(new ApiResponse(404, 3));
        list.add(new ApiResponse(404, 3));
        list.add(new ApiResponse(404, 3));
        list.add(new ApiResponse(500, 2));
        list.add(new ApiResponse(500, 2));
        list.add(new ApiResponse(500, 2));
        list.add(new ApiResponse(200, 4));
        list.add(new ApiResponse(201, 6));
        list.add(new ApiResponse(201, 6));
        list.add(new ApiResponse(201, 6));

        // {
        // 404: 9,
        // 500: 6,
        // 200: 4,
        // 201: 18
        // }

        Map<Integer, Integer> hash = new HashMap<>();

        // traverse list
        for (ApiResponse i : list) {
            // how do i put to map
            int statusCode = i.statusCode;
            int count = i.count;

            // manual

            // 1) check if already key present or not
            if (hash.containsKey(statusCode)) {
                hash.put(statusCode, hash.get(statusCode) + count);
            } else {
                hash.put(statusCode, count);
            }

            // 2) getOrDefault()
            // 200: 2
            hash.put(statusCode, hash.getOrDefault(statusCode, 0) + count);

        }

    }
}